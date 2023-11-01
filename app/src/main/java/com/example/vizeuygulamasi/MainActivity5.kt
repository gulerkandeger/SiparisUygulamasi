package com.example.vizeuygulamasi

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var necorbasi = findViewById<TextView>(R.id.necorbasi)
        var acibar = findViewById<SeekBar>(R.id.acibar)
        var tuzbar = findViewById<SeekBar>(R.id.tuzbar)
        var baskaarzu = findViewById<EditText>(R.id.baskaarzu)
        var siparisver = findViewById<Button>(R.id.siparisver)
        var sarimsak = findViewById<Switch>(R.id.sarimsak)
        var nane = findViewById<Switch>(R.id.nane)
        var dil = findViewById<Switch>(R.id.dil)
        var terbiye = findViewById<Switch>(R.id.terbiye)
        var beyin = findViewById<Switch>(R.id.beyin)
        var sirke = findViewById<Switch>(R.id.sirke)
        var krema = findViewById<Switch>(R.id.krema)
        var yag = findViewById<Switch>(R.id.yag)
        var kasar = findViewById<Switch>(R.id.kasar)
        var kitir = findViewById<Switch>(R.id.kitir)
        var limon =findViewById<Switch>(R.id.limon)
        var tozbiber = findViewById<Switch>(R.id.tozbiber)




        val alinancorba =intent.getStringExtra("aktarilancorba")
        necorbasi.text =  "$alinancorba Çorbası"

        if (alinancorba=="Ezogelin"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE

        }
        if (alinancorba=="Düğün"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if (alinancorba=="Mercimek"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if (alinancorba=="Brokoli"){
            krema.visibility = View.VISIBLE
        }
        if (alinancorba=="Kelle-Paça"){
            dil.visibility = View.VISIBLE
            sarimsak.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
        }
        if (alinancorba=="Yayla"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if (alinancorba=="Şehriye"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if (alinancorba=="Domates"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
            terbiye.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            kasar.visibility = View.VISIBLE
        }
        if (alinancorba=="Tarhana"){
            yag.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if (alinancorba=="Mantar"){
            krema.visibility = View.VISIBLE
        }
        if (alinancorba=="İşkembe"){
            sarimsak.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }
        if (alinancorba=="Tavuk"){
            krema.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
        }



        var besegecis = Intent(applicationContext, MainActivity6::class.java)
            besegecis.putExtra("gecencorba",alinancorba)
            tuzbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    if (p1 == 2) {
                        var tuzoran = "Bol Tuzlu"
                        besegecis.putExtra("tuzoran", tuzoran)
                        val uyari1 = AlertDialog.Builder(this@MainActivity5)
                        uyari1.setTitle("Uyarı!")
                        uyari1.setMessage("Bu kadar tuz istediğinize emin misiniz?")
                        uyari1.setIcon(R.drawable.tuz)
                        uyari1.setPositiveButton("EVET") { DialogInterface, i ->
                            Toast.makeText(
                                applicationContext,
                                "Bol Tuzlu Çorba",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                        uyari1.setNegativeButton("HAYIR") { DialogInterface, i ->
                            1
                            tuzbar.setProgress(1)
                        }
                        uyari1.create().show()
                    }
                    if (p1 == 1) {
                        var tuzoran = "Orta Tuzlu"
                        besegecis.putExtra("tuzoran", tuzoran)
                    }
                    if (p1 == 0) {
                        var tuzoran = "Tuzsuz"
                        besegecis.putExtra("tuzoran", tuzoran)
                    }
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                }
            })
            acibar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    if (p1 == 2) {
                        var acioran = "Bol Acılı"
                        besegecis.putExtra("acioran", acioran)
                        val uyari1 = AlertDialog.Builder(this@MainActivity5)
                        uyari1.setTitle("Uyarı!")
                        uyari1.setMessage("Bu kadar acı istediğinize emin misiniz?")
                        uyari1.setIcon(R.drawable.biber)
                        uyari1.setPositiveButton("EVET") { DialogInterface, i ->
                            Toast.makeText(
                                applicationContext,
                                "Bol Acılı Çorba",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                        uyari1.setNegativeButton("HAYIR") { DialogInterface, i ->
                            1
                            acibar.setProgress(1)
                        }
                        uyari1.create().show()
                    }

                    if (p1 == 1) {
                        var acioran = "Orta Acılı"
                        besegecis.putExtra("acioran", acioran)
                    }
                    if (p1 == 0) {
                        var acioran = "Acısız"
                        besegecis.putExtra("acioran", acioran)
                    }
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                }

            })

            siparisver.setOnClickListener {
                var arzular = baskaarzu.text
                besegecis.putExtra("arzular",arzular.toString())

                var sarimsakdurum = sarimsak.isChecked
                var nanedurum = nane.isChecked
                var dildurum = dil.isChecked
                var terbiyedurum = terbiye.isChecked
                var beyindurum = beyin.isChecked
                var sirkedurum = sirke.isChecked
                var kremadurum = krema.isChecked
                var yagdurum = yag.isChecked
                var kasardurum = kasar.isChecked
                var kitirdurum = kitir.isChecked
                var limondurum = limon.isChecked
                var tozbiberdurum = tozbiber.isChecked

                var icerik: ArrayList<String> = ArrayList()
                if (sarimsakdurum == true) {
                    var sarimsakgec = "sarımsak"
                    icerik.add("sarımsak")
                }
                if (nanedurum == true) {
                    var nanegec = "nane"
                    icerik.add("nane")
                }
                if (dildurum == true) {
                    var dilgec = "dil"
                    icerik.add("dil")
                }
                if (terbiyedurum == true) {
                    var terbiyegec = "terbiye"
                    icerik.add("terbiye")
                }
                if (beyindurum == true) {
                    var beyingec = "beyin"
                    icerik.add("beyin")
                }
                if (sirkedurum == true) {
                    var sirkegec = "sirke"
                    icerik.add("sirke")
                }
                if (kremadurum == true) {
                    var kremagec = "krema"
                    icerik.add("krema")
                }
                if (yagdurum == true) {
                    var yaggec = "yağ"
                    icerik.add("yağ")
                }
                if (kasardurum == true) {
                    var kasargec = "kaşar"
                    icerik.add("kaşar")
                }
                if (kitirdurum == true) {
                    var kitirgec = "kıtır"
                    icerik.add("kıtır")
                }
                if (limondurum == true) {
                    var limongec = "limon"
                    icerik.add("limon")
                }
                if (tozbiberdurum == true) {
                    var tozbibergec = "toz biber"
                    icerik.add("tozbiber")
                }
                besegecis.putExtra("aktarilanozellik",icerik)

                val uyari2 = AlertDialog.Builder(this)
                uyari2.setTitle("Siparişinizin Durumu")
                uyari2.setMessage("Siparişiniz Hazırlanacak.Devam Etmek İstiyor musunuz?")
                uyari2.setIcon(R.drawable.indir)
                uyari2.setPositiveButton("EVET") { DialogInterface, i ->
                    startActivity(besegecis)
                    finish()
                }
                uyari2.setNegativeButton("TEKRAR KONTROL ETMEK İSTİYORUM") { DialogInterface, i ->

                }
                uyari2.create().show()

            }

    }
}