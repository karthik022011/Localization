package com.kartheek.localization

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kartheek.localization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.buttonTelugu.setOnClickListener {
          val  context = LocaleHelper.setLocale(this, "en");
         val   resources = context.resources
         //   messageView.setText(resources.getString(R.string.language));
        }
    }


}