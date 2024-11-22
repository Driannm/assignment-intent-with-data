package com.example.tugas4_intentwithdata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pizza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        // Referensi ke button
        val buttonBack = findViewById<Button>(R.id.back_button)

        // Set onClickListener untuk tombol kembali
        buttonBack.setOnClickListener {
            // Intent untuk kembali ke MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Mengakhiri activity Pizza agar tidak tersimpan di back stack
        }
    }
}