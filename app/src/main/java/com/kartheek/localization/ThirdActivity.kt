package com.kartheek.localization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kartheek.localization.databinding.ActivityMainBinding
import com.kartheek.localization.databinding.ActivitySecondBinding
import com.kartheek.localization.databinding.ActivityThirdBinding

class ThirdActivity : BaseActivity(){
    private lateinit var binding : ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}