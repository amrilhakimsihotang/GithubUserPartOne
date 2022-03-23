package id.amrilhs.githubuserpartone

import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import id.amrilhs.githubuserpartone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        parseJSON()


    }

    private fun parseJSON() {
        GlobalSco
    }
}
