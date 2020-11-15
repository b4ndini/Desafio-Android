package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin = findViewById<Button>(R.id.btLogin)


        btLogin.setOnClickListener(){
            val intent = Intent(this, RegisterActivity::class.java)
            intent.putExtra("teste", "Luis Felipe")
            intent.putExtra("teste1", "lfelipe.maior@gmail.com")
            intent.putExtra("teste2", "felipe123")
            startActivity(intent)
        }

    }
}