package id.amrilhs.githubuserpartone

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.amrilhs.githubuserpartone.databinding.ListItemBinding

class GitAdapter(private val listGithubUser: ArrayList<GithubUser>) :
    RecyclerView.Adapter<GitAdapter.ListViewHolder>() {

    inner class ListViewHolder(private val listItemBinding: ListItemBinding) :
        RecyclerView.ViewHolder(listItemBinding.root) {

        fun bind(githubUser: GithubUser) {
            Glide.with(itemView.context)
                .load(githubUser.avatar)
                .apply(RequestOptions().override(widthLong, heightLong))
                .error(R.drawable.ic_baseline_error_24)
                .into(listItemBinding.avatar)
            listItemBinding.email.text = githubUser.email
            listItemBinding.txtName.text = githubUser.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listGithubUser[position])
        val data = listGithubUser[position]
        holder.itemView.setOnClickListener {
            val githubIntent = GithubUser(
                data.login,
                data.avatar,
                data.name,
                data.company,
                data.location,
                data.email,
                data.public_repos,
                data.follower,
                data.following
            )
            val mIntent = Intent(it.context, DetailGithubuser::class.java)
            mIntent.putExtra(DetailGithubuser.DETAIL_GITHUBUSER, githubIntent)
            it.context.startActivity(mIntent)
        }
    }

    override fun getItemCount(): Int {
        return listGithubUser.size
    }

    companion object {
        const val widthLong: Int = 800
        const val heightLong: Int = 600
    }
}
