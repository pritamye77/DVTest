package com.dvtest.myapplication.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.dvtest.myapplication.data.model.FoodModel
import kotlinx.android.synthetic.main.item_food.view.*

class FoodViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {
    fun bind(food: FoodModel) {
        root.tvTitle.text = food.title
        root.tvDescription.text = food.description
        root.tvCalories.text = food.calories
        root.tvRate.text = food.rate
        root.ivFood.setImageResource(food.imgId)
    }
}