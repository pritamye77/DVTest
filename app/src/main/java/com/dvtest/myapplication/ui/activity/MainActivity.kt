package com.dvtest.myapplication.ui.activity

import android.os.Bundle
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dvtest.myapplication.R
import com.dvtest.myapplication.data.model.foodDummyData
import com.dvtest.myapplication.ui.adapter.FoodAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var anim: Animation? = null
    private var foodAdapter: FoodAdapter = FoodAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvMain.adapter = foodAdapter
        foodAdapter.addAll(foodDummyData)

    }


}