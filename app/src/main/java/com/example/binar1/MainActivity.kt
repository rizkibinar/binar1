package com.example.binar1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.penjumlahan_layout) // untuk men set layout yang di pakai pada activity

//        val textLupaPassword = findViewById<TextView>(R.id.txt_lupa_password) // cari view di layout dengan id txt_lupa_password dengan bentuk TextView
//
//        val imgSupport = findViewById<ImageView>(R.id.img_support)
//
//        imgSupport.setImageResource(R.drawable.ic_baseline_4g_mobiledata_24)
//
//        println("text lupa ${textLupaPassword.text}")
//
//        // ganti text TextView "programically"
//        textLupaPassword.text = "Text lupa yang baru"
//
//        textLupaPassword.textAlignment = View.TEXT_ALIGNMENT_CENTER

        val txtWarna1 = findViewById<EditText>(R.id.edit_warna_pertama)
        val txtWarna2 = findViewById<EditText>(R.id.edit_warna_kedua)

        val txtHasil = findViewById<TextView>(R.id.txt_hasil)

        val btnHitung = findViewById<Button>(R.id.btn_hitung)

        btnHitung.setOnClickListener {

            val merah = "Merah"
            val biru = "Biru"
            val hijau = "Hijau"

            val warna1 = txtWarna1.text.toString()
            val warna2 = txtWarna2.text.toString()

            val isCampuranHijau = warna1 == merah && warna2 == biru || warna1 == biru && warna2 == merah
            val isCampuranCoklat = warna1 == "Merah" && warna2 == "Hijau" || warna1 == "Hijau" && warna2 == "Merah"
            val isCampuranCyan = warna1 == "Biru" && warna2 == "Hijau" || warna1 == "Hijau" && warna2 == "Biru"


            if(warna1 == merah && warna2 == biru || warna1 == biru && warna2 == merah) {
                txtHasil.text = "Warna hasil pencampuran = $hijau"
                println("Warna hasil pencampuran = $hijau")
            } else if(isCampuranCoklat) {
                txtHasil.text = "Warna hasil pencampuran = Coklat"
                println("Warna hasil pencampuran = Coklat")
            } else if(isCampuranCyan) {
                txtHasil.text = "Warna hasil pencampuran = Cyan"
                println("Warna hasil pencampuran = Cyan")
            }
        }




    }
}