package com.example.belajaractivity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajaractivity2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)

        val name1 = intent.getStringExtra("nama")
        val email3 = intent.getStringExtra("email")
        val alamat3 = intent.getStringExtra("alamat")
        val hp3 = intent.getStringExtra("hp")
        binding.nama2.text = "Nama : ${name1.toString()}"
        binding.email2.text = "Email : ${email3.toString()}"
        binding.alamat2.text = "Alamat : ${alamat3.toString()}"
        binding.hp2.text = "No Handphone : ${hp3.toString()}"
        setContentView(binding.root)
    }
}