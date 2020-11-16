package com.example.digitalhousefoods

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed(Runnable { mostrarMainActivity() }, 4000)

        //val ivSplashImage = findViewById<ImageView>(R.id.ivSplashImage)
        Glide.with(this).load("https://marvel-live.freetls.fastly.net/canvas/2019/3/c2e26d55ab7646b3a5e567ade2250948").into(
                findViewById<ImageView>(
                        R.id.ivSplashImage
                )
        )


    }

    private fun mostrarMainActivity() {
        val intent = Intent(
                this@SplashActivity, MainActivity::class.java
        )
        startActivity(intent)
        finish()
    }
}