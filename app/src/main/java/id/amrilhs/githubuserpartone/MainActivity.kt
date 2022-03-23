package id.amrilhs.githubuserpartone

import android.os.Bundle
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


}
