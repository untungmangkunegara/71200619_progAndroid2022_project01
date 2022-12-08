package com.example.a71200619_project_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        supportActionBar?.hide()

        val KotaAsal = intent.getStringExtra("iniKotaAsal").toString()
        val KotaTujuan = intent.getStringExtra("iniKotaTujuan").toString()
        val TanggalBerangkat = intent.getStringExtra("tanggalBerangkat").toString()
        val JamBerangkat = intent.getStringExtra("iniJamKeberangkatan").toString()
        val KelasTiket = intent.getStringExtra("iniKelasTiket").toString()

        val tvKotaAsal = findViewById<TextView>(R.id.tvSumKotaAsal)
        val tvKotaTujuan = findViewById<TextView>(R.id.tvSumKotaTujuan)
        val tvTanggalBerangkat = findViewById<TextView>(R.id.tvSumTanggalBerangkat)
        val tvJamBerangkat = findViewById<TextView>(R.id.tvSumJamBerangkat)
        val tvKelasTiket = findViewById<TextView>(R.id.tvSumKelasTiket)

        tvKotaAsal.text = "Kota Asal: $KotaAsal"
        tvKotaTujuan.text = "Kota Tujuan: $KotaTujuan"
        tvJamBerangkat.text = "Jam Berangkat: $JamBerangkat"
        tvKelasTiket.text = "Kelas Tiket: $KelasTiket"



    }
}