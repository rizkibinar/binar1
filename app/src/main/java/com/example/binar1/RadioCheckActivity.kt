package com.example.binar1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class RadioCheckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_check)

        val checkBox = findViewById<CheckBox>(R.id.check_contoh)

        checkBox.setOnCheckedChangeListener { view, isChecked ->
            Toast.makeText(this, "Kondisi Check : $isChecked", Toast.LENGTH_SHORT).show()
        }

        val radioGroup = findViewById<RadioGroup>(R.id.radiogroup_persetujuan)

        radioGroup.setOnCheckedChangeListener { radioGroup, id ->
            if(id == R.id.radio_button_setuju) {
                Toast.makeText(this, "Kondisi Radio : Setuju", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Kondisi Radio : Tidak Setuju", Toast.LENGTH_SHORT).show()
            }


        }


    }
}