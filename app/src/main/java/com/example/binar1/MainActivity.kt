package com.example.binar1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main) // untuk men set layout yang di pakai pada activity

        val textLupaPassword = findViewById<TextView>(R.id.txt_lupa_password) // cari view di layout dengan id txt_lupa_password dengan bentuk TextView

        val imgSupport = findViewById<ImageView>(R.id.img_support)

        imgSupport.setImageResource(R.drawable.ic_baseline_4g_mobiledata_24)

        println("text lupa ${textLupaPassword.text}")

        // ganti text TextView "programically"
        textLupaPassword.text = "Text lupa yang baru"

        textLupaPassword.textAlignment = View.TEXT_ALIGNMENT_CENTER

    }
}