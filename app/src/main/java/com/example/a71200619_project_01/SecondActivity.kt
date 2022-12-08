package com.example.a71200619_project_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.hide()

        val rgJamBerangkat = findViewById<RadioGroup>(R.id.rgJam)
        val jam10 = findViewById<RadioButton>(R.id.rb10)
        val jam16 = findViewById<RadioButton>(R.id.rb16)
        val jam20 = findViewById<RadioButton>(R.id.rb20)

        val rgKelas = findViewById<RadioGroup>(R.id.rgKelasTiket)
        val ekonomi = findViewById<RadioButton>(R.id.rbEkonomi)
        val bisnis = findViewById<RadioButton>(R.id.rbBisnis)

        val btnSubmit2 = findViewById<Button>(R.id.btnSubmit2)

        btnSubmit2.setOnClickListener() {
            if (rgJamBerangkat.checkedRadioButtonId == -1 || rgKelas.checkedRadioButtonId == -1) {
                Toast.makeText(
                    this,
                    "Pastikan anda mengisi semua kolom pengisian.",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (rgJamBerangkat.checkedRadioButtonId == jam10.id && rgKelas.checkedRadioButtonId == ekonomi.id) {
                val jam = jam10.text.toString()
                val kelas = ekonomi.text.toString()

                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("iniJamKeberangkatan", jam)
                intent.putExtra("iniKelasTiket", kelas)

                startActivity(intent)
            } else if (rgJamBerangkat.checkedRadioButtonId == jam10.id && rgKelas.checkedRadioButtonId == bisnis.id) {
                val jam = jam10.text.toString()
                val kelas = bisnis.text.toString()

                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("iniJamKeberangkatan", jam)
                intent.putExtra("iniKelasTiket", kelas)

                startActivity(intent)
            } else if (rgJamBerangkat.checkedRadioButtonId == jam16.id && rgKelas.checkedRadioButtonId == ekonomi.id) {
                val jam = jam16.text.toString()
                val kelas = ekonomi.text.toString()

                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("iniJamKeberangkatan", jam)
                intent.putExtra("iniKelasTiket", kelas)

                startActivity(intent)
            } else if (rgJamBerangkat.checkedRadioButtonId == jam16.id && rgKelas.checkedRadioButtonId == bisnis.id) {
                val jam = jam16.text.toString()
                val kelas = bisnis.text.toString()

                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("iniJamKeberangkatan", jam)
                intent.putExtra("iniKelasTiket", kelas)

                startActivity(intent)
            } else if (rgJamBerangkat.checkedRadioButtonId == jam20.id && rgKelas.checkedRadioButtonId == ekonomi.id) {
                val jam = jam20.text.toString()
                val kelas = ekonomi.text.toString()

                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("iniJamKeberangkatan", jam)
                intent.putExtra("iniKelasTiket", kelas)

                startActivity(intent)
            } else if (rgJamBerangkat.checkedRadioButtonId == jam20.id && rgKelas.checkedRadioButtonId == bisnis.id) {
                val jam = jam20.text.toString()
                val kelas = bisnis.text.toString()

                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("iniJamKeberangkatan", jam)
                intent.putExtra("iniKelasTiket", kelas)

                startActivity(intent)
            }
        }
    }
}