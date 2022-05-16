package com.example.binar1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SpinnerRecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_recycler)

        val spinner  = findViewById<Spinner>(R.id.spinner)

        // item pertama untuk menampilkan Spinner, berisi data yang ingin di pilih user
        val dataSet = arrayOf("SD", "SMP", "SMA", "Kuliah")

        // item kedua, adapter berfungsi untuk menghubungkan dataset ke tampilan UI
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            this@SpinnerRecyclerActivity,
            android.R.layout.simple_spinner_dropdown_item, dataSet
        )

        // set adapter ke spinner
        spinner.adapter = adapter



        val recyclerView = findViewById<RecyclerView>(R.id.example_recyclerview)

        // set bentuk tampilan recyclerview,
        // LinearLayoutManager = Tampilan list ke bawah(pengganti ListView)
        // GridLayoutManager = Tampilan kotak kotak ke kanan (pengganti GridView)

        //contoh pake gridLayoutManager
        // param 1 = context
        // param 2 = jumlah kotak ke kanan
//        recyclerView.layoutManager = GridLayoutManager(this, 2)

        // param 1 context
        // param 2 Orientasi dari recyclernya
        // param 3 untuk membalik data
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = CustomAdapter(dataSet, onItemClick = {
            Toast.makeText(this@SpinnerRecyclerActivity, it, Toast.LENGTH_SHORT).show()
        })


    }
}