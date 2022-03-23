package id.amrilhs.githubuserpartone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.amrilhs.githubuserpartone.databinding.ActivityDetailGithubuserBinding

class DetailGithubuser : AppCompatActivity() {
    private lateinit var detailGithubuserBinding: ActivityDetailGithubuserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailGithubuserBinding = ActivityDetailGithubuserBinding.inflate(layoutInflater)
        setContentView(detailGithubuserBinding.root)
    }

    companion object{
        const val DETAIL_GITHUBUSER= "detail_githubuser"
    }
}