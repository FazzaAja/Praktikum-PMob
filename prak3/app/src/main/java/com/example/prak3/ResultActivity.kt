package com.example.prak3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prak3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(DATA_NAMA)
        val username = intent.getStringExtra(DATA_USERNAME)
        val umur = intent.getStringExtra(DATA_UMUR)
        val email = intent.getStringExtra(DATA_EMAIL)
        val gender = intent.getStringExtra(DATA_KELAMIN)

        binding.apply {
            txtFullName.text = "Full Name: $nama"
            txtUsername.text = "Username: $username"
            txtAge.text = "Age: $umur"
            txtEmail.text = "Email: $email"
            txtGender.text = "Gender: $gender"
        }
    }

    companion object {
        const val DATA_NAMA = "nama"
        const val DATA_USERNAME = "username"
        const val DATA_UMUR = "umur"
        const val DATA_EMAIL = "email"
        const val DATA_KELAMIN = "kelamin"
    }
}