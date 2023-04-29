package com.example.a10120781latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonmulai = findViewById<Button>(R.id.btnWalkthroughStart)
        buttonmulai.setOnClickListener {
            val intent1 = Intent (this, LoginCodeActivity::class.java)
            startActivity(intent1)
        }
    }
}

// Nama                 : Guruh Fillah Alfariza
// NIM                  : 10102781
// Kelas                : IF-9
// Tanggal Pengerjaan   : 28/04/2023