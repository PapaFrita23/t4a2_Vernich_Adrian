package com.example.t4a2_vernich_adrian

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.t4a2_vernich_adrian.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dni = intent.getStringExtra("DNI")
        binding.textViewWelcome.text = "Bienvenido/a, $dni"

        binding.btnSalir.setOnClickListener {
            finish()
        }
    }
}