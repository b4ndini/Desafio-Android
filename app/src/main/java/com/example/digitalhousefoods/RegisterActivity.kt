package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val nome = intent.getStringExtra("teste")
        val email = intent.getStringExtra("teste1")
        val password = intent.getStringExtra("teste2")

        val u1 = User(nome ?: "asd", email ?: "asd@", password ?: "null")

        Log.i("testao", u1.name)
        Log.i("testao", u1.email)
        Log.i("testao", u1.password)


        val asd = findViewById<TextInputEditText>(R.id.tilNameEdit)
        asd.setText(u1.name)

        findViewById<Button>(R.id.btRegister).setOnClickListener(){
            val intent = Intent(this, RestaurantActivity::class.java)

            startActivity(intent)
        }

    }
}