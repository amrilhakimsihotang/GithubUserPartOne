package id.amrilhs.githubuserpartone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.amrilhs.githubuserpartone.databinding.ActivityDetailGithubuserBinding

class DetailGithubuser : AppCompatActivity() {
    private lateinit var detailGithubuserBinding: ActivityDetailGithubuserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailGithubuserBinding = ActivityDetailGithubuserBinding.inflate(layoutInflater)
        setContentView(detailGithubuserBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val userGithub = intent.getParcelableExtra<GithubUser>(DETAIL_GITHUBUSER) as GithubUser
        Glide.with(this)
            .load(userGithub.avatar)
            .apply(RequestOptions().override(widthLong, heightLong))
            .error(R.drawable.ic_baseline_error_24)
            .into(detailGithubuserBinding.detImg)
          detailGithubuserBinding.apply {
              idname.text =userGithub.name
              detEmail.text =userGithub.email
              detUsername.text = userGithub.login
              detLocation.text =userGithub.location
              detCompany.text =userGithub.company
              detPublicRepo.text =userGithub.public_repos.toString()
              detFollower.text = userGithub.follower.toString()
              detFollowing.text =userGithub.following.toString()
          }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val DETAIL_GITHUBUSER= "detail_githubuser"
        const val widthLong: Int = 800
        const val heightLong: Int = 600
    }
}