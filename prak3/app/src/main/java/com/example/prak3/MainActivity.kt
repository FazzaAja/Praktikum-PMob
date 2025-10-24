package com.example.prak3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.prak3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var jenisKelamin = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val nama = binding.fullnama.text.toString()
            val user = binding.username.text.toString()
            val usia = binding.age.text.toString()
            val email = binding.email.text.toString()
            val pass = binding.password.text.toString()
            val confirm = binding.confirmpass.text.toString()

            jenisKelamin = if (binding.rdb1.isChecked) {
                "Laki-laki"
            } else {
                "Perempuan"
            }

            if (nama.isEmpty() || user.isEmpty() || usia.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                Toast.makeText(this, "Isi semua data dulu bro", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (pass != confirm) {
                Toast.makeText(this, "Password tidak sama!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ResultActivity.DATA_NAMA, nama)
            intent.putExtra(ResultActivity.DATA_USERNAME, user)
            intent.putExtra(ResultActivity.DATA_UMUR, usia)
            intent.putExtra(ResultActivity.DATA_EMAIL, email)
            intent.putExtra(ResultActivity.DATA_KELAMIN, jenisKelamin)

            startActivity(intent)
        }
    }
}