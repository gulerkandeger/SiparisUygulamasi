package com.example.vizeuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var ilkprogres = findViewById<ProgressBar>(R.id.ilkprogres)
        var g = findViewById<TextView>(R.id.g)
        var u = findViewById<TextView>(R.id.u)
        var l = findViewById<TextView>(R.id.l)
        var e = findViewById<TextView>(R.id.e)
        var r = findViewById<TextView>(R.id.r)
        var gcheck = findViewById<ImageView>(R.id.gcheck)
        var ucheck = findViewById<ImageView>(R.id.ucheck)
        var lcheck = findViewById<ImageView>(R.id.lcheck)
        var echeck = findViewById<ImageView>(R.id.echeck)
        var rcheck = findViewById<ImageView>(R.id.rcheck)

        g.setOnClickListener {
            gcheck.visibility = View.VISIBLE
            u.setOnClickListener {
                ucheck.visibility = View.VISIBLE
                l.setOnClickListener {
                    lcheck.visibility = View.VISIBLE
                    e.setOnClickListener {
                        echeck.visibility = View.VISIBLE
                        r.setOnClickListener {
                            rcheck.visibility = View.VISIBLE
                            ilkprogres.visibility = View.VISIBLE
                            if (rcheck.isVisible) {
                                Handler().postDelayed({
                                    var ucegecis =
                                        Intent(applicationContext, MainActivity4::class.java)
                                    startActivity(ucegecis)
                                    finish()
                                }, 2000)
                            }
                        }
                    }
                }
            }
        }
    }
}


