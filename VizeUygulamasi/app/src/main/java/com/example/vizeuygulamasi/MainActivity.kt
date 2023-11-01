package com.example.vizeuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animation = AnimationUtils.loadAnimation(this,R.anim.animation)

        var giris = findViewById<TextView>(R.id.textView)
        giris.animation = animation

        Handler().postDelayed({
            var ikiyegecis = Intent(applicationContext,MainActivity3::class.java)
            startActivity(ikiyegecis)
            finish()
        },2000)

    }
}