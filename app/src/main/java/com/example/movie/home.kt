package com.example.movie

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.movie.databinding.ActivityHomeBinding

class home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Mendapatkan username dari Intent yang dikirim dari aktivitas login
        val username = intent.getStringExtra("USERNAME")

        // Menemukan TextView untuk menampilkan username
        val usernameTextView = findViewById<TextView>(R.id.usrview)

        // Menampilkan username di TextView
        usernameTextView.text = username
    }
}