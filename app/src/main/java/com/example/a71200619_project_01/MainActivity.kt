package com.example.a71200619_project_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val rgKotaAsal = findViewById<RadioGroup>(R.id.rgKotaAsal)
        val yogyakartaAsal = findViewById<RadioButton>(R.id.rbYogyaAsal)
        val jakartaAsal = findViewById<RadioButton>(R.id.rbJakartaAsal)
        val baliAsal = findViewById<RadioButton>(R.id.rbBaliAsal)

        val rgKotaTujuan = findViewById<RadioGroup>(R.id.rgKotaTujuan)
        val yogyakarta = findViewById<RadioButton>(R.id.rbYogya)
        val jakarta = findViewById<RadioButton>(R.id.rbJakarta)
        val bali = findViewById<RadioButton>(R.id.rbBali)

        val tanggalKebarangkatan = findViewById<EditText>(R.id.edtTanggalKeberangkatan)

        val btnSubmit1 = findViewById<Button>(R.id.btnSubmit1)

        btnSubmit1.setOnClickListener(){
            if(rgKotaTujuan.checkedRadioButtonId == -1 || rgKotaAsal.checkedRadioButtonId == -1){
                Toast.makeText(this, "Pastikan anda mengisi semua kolom pengisian.",Toast.LENGTH_SHORT).show()
            }
            else if (rgKotaTujuan.checkedRadioButtonId == yogyakarta.id && rgKotaAsal.checkedRadioButtonId == yogyakartaAsal.id){
                val dari = yogyakarta.text.toString()
                val asal = yogyakartaAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("iniKotaTujuan",dari)

                startActivity(intent)
            }
            else if (rgKotaTujuan.checkedRadioButtonId == yogyakarta.id && rgKotaAsal.checkedRadioButtonId == jakartaAsal.id){
                val dari = yogyakarta.text.toString()
                val asal = jakartaAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("IniKotaTujuan",dari)
                startActivity(intent)
            }
            else if (rgKotaTujuan.checkedRadioButtonId == yogyakarta.id && rgKotaAsal.checkedRadioButtonId == baliAsal.id){
                val dari = yogyakarta.text.toString()
                val asal = baliAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("IniKotaTujuan",dari)
                startActivity(intent)
            }
//          //
            else if (rgKotaTujuan.checkedRadioButtonId == bali.id && rgKotaAsal.checkedRadioButtonId == yogyakartaAsal.id){
                val dari = bali.text.toString()
                val asal = yogyakartaAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("iniKotaTujuan",dari)

                startActivity(intent)
            }
            else if (rgKotaTujuan.checkedRadioButtonId == bali.id && rgKotaAsal.checkedRadioButtonId == jakartaAsal.id){
                val dari = bali.text.toString()
                val asal = jakartaAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("IniKotaTujuan",dari)
                startActivity(intent)
            }
            else if (rgKotaTujuan.checkedRadioButtonId == bali.id && rgKotaAsal.checkedRadioButtonId == baliAsal.id){
                val dari = bali.text.toString()
                val asal = baliAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("IniKotaTujuan",dari)
                startActivity(intent)
            }
            //
            else if (rgKotaTujuan.checkedRadioButtonId == jakarta.id && rgKotaAsal.checkedRadioButtonId == yogyakartaAsal.id){
                val dari = jakarta.text.toString()
                val asal = yogyakartaAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("iniKotaTujuan",dari)

                startActivity(intent)
            }
            else if (rgKotaTujuan.checkedRadioButtonId == jakarta.id && rgKotaAsal.checkedRadioButtonId == jakartaAsal.id){
                val dari = jakarta.text.toString()
                val asal = jakartaAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("IniKotaTujuan",dari)
                startActivity(intent)
            }
            else if (rgKotaTujuan.checkedRadioButtonId == jakarta.id && rgKotaAsal.checkedRadioButtonId == baliAsal.id){
                val dari = jakarta.text.toString()
                val asal = baliAsal.text.toString()

                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("iniKotaAsal",asal)
                intent.putExtra("IniKotaTujuan",dari)
                startActivity(intent)
            }
        }

    }

}