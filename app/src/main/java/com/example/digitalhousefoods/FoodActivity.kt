package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val restaurants = mutableListOf<Restaurant>()

        val r1 = Restaurant("Tony Roma's", "Psso da areia", "Fecha as 23:00", "https://marvel-live.freetls.fastly.net/canvas/2019/3/024af23ffd844cbeb68d8f79bcab1c28")


        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)
        restaurants.add(r1)

        val ivRestaurantImage = findViewById<ImageView>(R.id.ivRestaurantImage)
        Glide.with(this).load(r1.image).into(ivRestaurantImage)

        findViewById<RecyclerView>(R.id.rvFoodList).apply{
            layoutManager = GridLayoutManager(this@FoodActivity,2)
            adapter = FoodAdapter(restaurants){
                val intent = Intent(this@FoodActivity, FoodDetailActivity::class.java)
                startActivity(intent)
            }
        }
    }
}