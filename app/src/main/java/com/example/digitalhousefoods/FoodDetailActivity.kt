package com.example.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class FoodDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)




        val ivFoodPhoto = findViewById<ImageView>(R.id.ivFoodPhoto)
        Glide.with(this).load("https://marvel-live.freetls.fastly.net/canvas/2019/3/024af23ffd844cbeb68d8f79bcab1c28").into(ivFoodPhoto)

    }
}