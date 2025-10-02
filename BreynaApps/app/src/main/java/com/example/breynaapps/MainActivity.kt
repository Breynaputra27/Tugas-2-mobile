package com.example.hellotoast

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mCount = 0  // variabel untuk angka

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hubungkan layout dengan kode
        val mShowCount = findViewById<TextView>(R.id.show_count)
        val buttonCountUp = findViewById<Button>(R.id.button_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)

        // Tombol Count → angka bertambah
        buttonCountUp.setOnClickListener {
            mCount++
            mShowCount.text = mCount.toString()
        }

        // Tombol Toast → munculkan popup angka
        buttonToast.setOnClickListener {
            val tulisan = mShowCount.text.toString()
            Toast.makeText(this, "Angka yang dimunculkan $tulisan", Toast.LENGTH_LONG).show()
        }
    }
}
