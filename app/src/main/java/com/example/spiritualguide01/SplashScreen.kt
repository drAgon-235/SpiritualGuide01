package com.example.spiritualguide01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashIntent = Intent(this@SplashScreen,MainActivity::class.java)

        Handler().postDelayed({
            startActivity(splashIntent)
            finish()
        }, 2000)

    }
}