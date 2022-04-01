package id.amrilhs.githubuserpartone

import android.app.AlertDialog
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import id.amrilhs.githubuserpartone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var listUser: ArrayList<GithubUser> = arrayListOf()
    private lateinit var gitAdapter: GitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listUser.addAll(DataObj.listData)
        gitAdapter = GitAdapter(listUser)
        showDataRecyclerView()
    }


    private fun showDataRecyclerView() {
        binding.rvHome.layoutManager = GridLayoutManager(this, 2)
        binding.rvHome.setHasFixedSize(true)
        binding.rvHome.adapter = gitAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about_menu ->{
                aboutDialog()
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun aboutDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.title_about)
        builder.setMessage(R.string.content_about)
        builder.setPositiveButton("OK",{_,_->})
        builder.show()
    }

}
