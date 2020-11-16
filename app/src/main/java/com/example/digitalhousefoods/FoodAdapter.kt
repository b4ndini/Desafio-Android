package com.example.digitalhousefoods

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FoodAdapter (

    val restaurantList: List<Restaurant>,
    val onItemClicked: (Int) -> Unit
) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.food_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodAdapter.ViewHolder, position: Int) {
        holder.bind(restaurantList[position], onItemClicked)
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(restaurant : Restaurant, onItemClicked: (Int) -> Unit) = with(itemView) {


            val ivFoodImage = findViewById<ImageView>(R.id.ivFoodImage)
            Glide.with(itemView.context).load(restaurant.image).into(ivFoodImage)

            findViewById<ViewGroup>(R.id.vgFoodContainer).setOnClickListener{
                onItemClicked(this@ViewHolder.adapterPosition)
            }

            //findViewById<AppCompatTextView>(R.id.tvName).text = restaurant.name
            //findViewById<AppCompatTextView>(R.id.tvAddress).text = restaurant.address
            //findViewById<AppCompatTextView>(R.id.tvTime).text = restaurant.time


        }
    }


}