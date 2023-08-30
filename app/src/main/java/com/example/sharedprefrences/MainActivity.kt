package com.example.sharedprefrences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sharedprefrences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences: SharedPreferences =
            getSharedPreferences("myData", Context.MODE_PRIVATE)
        val userName = sharedPreferences.getString("U", "None")
        val password = sharedPreferences.getString("P", "")
        binding.userName.setText(userName)
        binding.password.setText(password)


        binding.load.setOnClickListener{
            val sharedPreferences: SharedPreferences =
                getSharedPreferences("myData", Context.MODE_PRIVATE)
            val userName = sharedPreferences.getString("U", "None")
            val password = sharedPreferences.getString("P", "")
            binding.userName.setText(userName)
            binding.password.setText(password)
        }
    }
}