package com.example.tugas4_intentwithdata

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Deklarasi variabel tombol
        val lpizza: ImageButton = findViewById(R.id.ib_pizza)
        val lburger: ImageButton = findViewById(R.id.ib_burger)
        val lkentang: ImageButton = findViewById(R.id.ib_kentang)
        val lhotdog: ImageButton = findViewById(R.id.ib_hotdog)

        lpizza.setOnClickListener(this)
        lburger.setOnClickListener(this)
        lkentang.setOnClickListener(this)
        lhotdog.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.ib_pizza -> {
                val intent = Intent(this@MainActivity, Pizza::class.java)
                startActivity(intent)
            }

            R.id.ib_burger -> {
                val intent = Intent(this@MainActivity, Burger::class.java)
                startActivity(intent)
            }

            R.id.ib_kentang -> {
                val intent = Intent(this@MainActivity, Kentang::class.java)
                startActivity(intent)
            }

            R.id.ib_hotdog -> {
                val intent = Intent(this@MainActivity, Hotdog::class.java)
                startActivity(intent)
            }
        }
    }
}