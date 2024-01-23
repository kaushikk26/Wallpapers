package com.example.wallpaper01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView

class Splash : AppCompatActivity() {

    lateinit var wallpaper_icon:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(Intent(this@Splash,MainActivity::class.java))

        },1800)

    }
}