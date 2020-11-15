package com.example.digitalhousefoods

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainAdapter(
        val restaurantList: List<Restaurant>
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.main_list_restaurant, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.bind(restaurantList[position])
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun bind(restaurant : Restaurant) = with(itemView) {


        val ivRestaurant = findViewById<ImageView>(R.id.ivRestaurant)
        Glide.with(itemView.context).load(restaurant.image).into(ivRestaurant)

        findViewById<AppCompatTextView>(R.id.tvName).text = restaurant.name
        findViewById<AppCompatTextView>(R.id.tvAddress).text = restaurant.address
        findViewById<AppCompatTextView>(R.id.tvTime).text = restaurant.time


    }
    }

    }

