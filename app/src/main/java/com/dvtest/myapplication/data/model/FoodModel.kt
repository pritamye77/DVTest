package com.dvtest.myapplication.data.model

import com.dvtest.myapplication.R

data class FoodModel(
        val title: String,
        val description: String,
        val calories: String,
        val rate: String,
        val imgId: Int
)

val foodDummyData: ArrayList<FoodModel> = arrayListOf(
        FoodModel(
                "Black Cake",
                "Chocolate sponge layered with strawberry cream and coated with fine belgian chocolate ganache. Fresh strawberries in between the layers. Perfect balance of sweetness from the cream, tanginess from the strawberries and (find a word to describe the chocolate...) of belgian chocolate",
                "80cal",
                "4.5 rating",
                R.drawable.ic_banner_deal
        ),
        FoodModel(
                "While Cake",
                "Rich Italian Mascarpone Cheese is rare to find, but creates wonders when baked with expert hands.The art lies in creating a perfect balance with the tingy sourness of fresh strawberries with the sweetness of Mascorpone Cheese,clubbed with Vanila Sponge and fresh dairy cream, Here's a steal deal to surprise your beloved this valentine's day with the exotic Strawberry Mascarpone Cheese cake, topped with heart shaped fresh cut strawberries,ideal to win her heart with this perfect delicacy for the occasion!",
                "80cal",
                "4.5 rating",
                R.drawable.ic_banner_info
        )

)