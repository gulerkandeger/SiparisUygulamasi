package com.example.vizeuygulamasi

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        var corbacek = findViewById<TextView>(R.id.corbacek)
        var ozellik = findViewById<TextView>(R.id.ozellikler)
        var ekstra = findViewById<TextView>(R.id.ekstraistek)
        var yenisiparis = findViewById<TextView>(R.id.yenisiparis)
        var cancel = findViewById<ImageView>(R.id.imageView6)
        var icinde = findViewById<TextView>(R.id.textView4)


        var gelencorba = intent.getStringExtra("gecencorba")
        var tuzoran = intent.getStringExtra("tuzoran")
        if (tuzoran==null)
             tuzoran="Tuzsuz"
        var acioran = intent.getStringExtra("acioran")
        if (acioran==null)
            acioran="Acısız"
        corbacek.text = "Bir $gelencorba Çorbası Çeeek, $acioran ve $tuzoran Olsun"

        val gelenarzu = intent.getStringExtra("arzular")
            ekstra.text = "Ekstra İstek : $gelenarzu"


        val numberList = intent .getSerializableExtra( "aktarilanozellik" )
        ozellik.text = numberList.toString()




        object : CountDownTimer(10000,1000) {
            override fun onTick(p0: Long) {
                yenisiparis.visibility = View.INVISIBLE
                Handler().postDelayed({
                    yenisiparis.visibility = View.VISIBLE
                },500)
            }
            override fun onFinish() {
            }

        }.start()
        yenisiparis.setOnClickListener{
            var tekrardördegecis = Intent(applicationContext,MainActivity4::class.java)
            startActivity(tekrardördegecis)
        }
        cancel.setOnClickListener{
            val uyari = AlertDialog.Builder(this)
            uyari.setTitle("Çıkış")
            uyari.setMessage("Çıkmak İstediğinize Emin misiniz?")
            uyari.setIcon(R.drawable.cancel)
            uyari.setPositiveButton("EVET"){DialogInterface, i->
                System.exit(0)
            }
            uyari.setNegativeButton("HAYIR"){DialogInterface, i->

            }
            uyari.create().show()
        }

    }
}