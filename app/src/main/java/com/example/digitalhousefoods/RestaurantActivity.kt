package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)


        val restaurants = mutableListOf<Restaurant>()

        val r1 = Restaurant("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha as 23:00", "https://marvel-live.freetls.fastly.net/canvas/2019/3/9402de97ca8e40c5852d019c948f8adc")
        val r2 = Restaurant("Aoyama", "Alameda dos Arapanés, 532 - Moema", "Fecha as 21:00", "https://marvel-live.freetls.fastly.net/canvas/2019/3/024af23ffd844cbeb68d8f79bcab1c28")
        val r3 = Restaurant("Outback", "Av. Moaci, 187, 187 - Moema, São Paulo", "Fecha as 22:00", "https://marvel-live.freetls.fastly.net/canvas/2019/3/5039046b70024e8ebe159e6a0f6eec56")
        val r4 = Restaurant("Subway", "Alameda Jauaperi, 626 - Moema", "Fecha as 00:00", "https://marvel-live.freetls.fastly.net/canvas/2019/3/6d8464567d464ca98140caad2427bb6f")

        restaurants.add(r1)
        restaurants.add(r2)
        restaurants.add(r3)
        restaurants.add(r4)

        findViewById<RecyclerView>(R.id.rvRestaurantList).apply{
        layoutManager = LinearLayoutManager(this@RestaurantActivity)
            adapter = MainAdapter(restaurants) {
                val intent = Intent(this@RestaurantActivity, FoodActivity::class.java)
                startActivity(intent)
            }


        }
    }
}