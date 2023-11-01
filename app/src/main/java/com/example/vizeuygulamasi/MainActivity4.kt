package com.example.vizeuygulamasi

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var corba = findViewById<CheckBox>(R.id.corba)
        var mercimek = findViewById<RadioButton>(R.id.mercimek)
        var ezogelin = findViewById<RadioButton>(R.id.ezogelin)
        var yayla = findViewById<RadioButton>(R.id.yayla)
        var dugun = findViewById<RadioButton>(R.id.dugun)
        var mantar = findViewById<RadioButton>(R.id.mantar)
        var kellepaca = findViewById<RadioButton>(R.id.kellepaca)
        var brokoli = findViewById<RadioButton>(R.id.brokoli)
        var sehriye = findViewById<RadioButton>(R.id.sehriye)
        var domates = findViewById<RadioButton>(R.id.domates)
        var tarhana = findViewById<RadioButton>(R.id.tarhana)
        var iskembe = findViewById<RadioButton>(R.id.iskembe)
        var tavuk = findViewById<RadioButton>(R.id.tavuk)
        var devam = findViewById<Button>(R.id.devam)
        var RadioGroup = findViewById<RadioGroup>(R.id.RadioGroup)

        corba.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                mercimek.visibility = View.VISIBLE
                ezogelin.visibility = View.VISIBLE
                yayla.visibility = View.VISIBLE
                dugun.visibility = View.VISIBLE
                mantar.visibility = View.VISIBLE
                kellepaca.visibility = View.VISIBLE
                brokoli.visibility = View.VISIBLE
                sehriye.visibility = View.VISIBLE
                domates.visibility = View.VISIBLE
                tarhana.visibility = View.VISIBLE
                iskembe.visibility = View.VISIBLE
                tavuk.visibility = View.VISIBLE
                devam.visibility = View.VISIBLE
            }
        }
        devam.setOnClickListener{
            var mercimekdurum = mercimek.isChecked
            var ezogelindurum = ezogelin.isChecked
            var yayladurum = yayla.isChecked
            var dugundurum = dugun.isChecked
            var mantardurum = mantar.isChecked
            var kellepacadurum = kellepaca.isChecked
            var brokolidurum = brokoli.isChecked
            var sehriyedurum = sehriye.isChecked
            var domatesdurum = domates.isChecked
            var tarhanadurum = tarhana.isChecked
            var iskembedurum = iskembe.isChecked
            var tavukdurum = tavuk.isChecked

            var id: Int = RadioGroup.checkedRadioButtonId
            if (id!=-1){
                if (mercimekdurum==true){
                    var anahtar = "Mercimek"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Mercimek Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (ezogelindurum==true){
                    var anahtar = "Ezogelin"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Ezogelin Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (dugundurum==true){
                    var anahtar = "Düğün"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Düğün Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (brokolidurum==true){
                    var anahtar = "Brokoli"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Brokoli Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (kellepacadurum==true){
                    var anahtar = "Kelle-Paça"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Kelle-Paça Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (yayladurum==true){
                    var anahtar = "Yayla"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Yayla Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (sehriyedurum==true){
                    var anahtar = "Şehriye"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Şehriye Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (domatesdurum==true){
                    var anahtar = "Domates"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Domates Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (tarhanadurum==true){
                    var anahtar = "Tarhana"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Tarhana Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (mantardurum==true){
                    var anahtar = "Mantar"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Mantar Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (iskembedurum==true){
                    var anahtar = "İşkembe"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "İşkembe Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }

                if (tavukdurum==true) {
                    var anahtar = "Tavuk"
                    var tasarim = layoutInflater.inflate(R.layout.ozeltoast,null)
                    var ozeltoastyazi = tasarim.findViewById<TextView>(R.id.textView2)
                    ozeltoastyazi.text= "Tavuk Çorbası Güzel Seçim Lütfen Bekleyiniz"
                    var ozeltoast = Toast(applicationContext)
                    ozeltoast.view = tasarim
                    ozeltoast.setGravity(Gravity.BOTTOM,0,0)
                    ozeltoast.duration = Toast.LENGTH_SHORT
                    ozeltoast.show()
                    Handler().postDelayed({
                        var dordegecis = Intent(applicationContext,MainActivity5::class.java)
                        dordegecis.putExtra("aktarilancorba",anahtar)
                        startActivity(dordegecis)
                        finish()
                    },2000)
                }
            }
            else{
                val uyari = AlertDialog.Builder(this)
                uyari.setTitle("Uyarı!")
                uyari.setMessage("Lütfen Seçiminizi Yapınız")
                uyari.setIcon(R.drawable.indir)
                uyari.setNeutralButton("TEKRAR DENE"){DialogInterface, i->
                }
                uyari.create().show()
            }
        }
    }
}











