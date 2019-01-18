package com.example.tbilisi

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class FoodFragment  : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_food, container, false)
        var listView = view.findViewById<ListView>(R.id.foodlistView) as ListView
        var arrFood: ArrayList<Food> = ArrayList()

        arrFood.add(Food("Ресторан «Джаганнат» подходит для вегетарианцев, веганов",  R.drawable.djaga))
        arrFood.add(Food("Кафе «Крабстер»",  R.drawable.crab))
        arrFood.add(Food("Кафе Lusun",  R.drawable.lus))

        listView.adapter = FoodAdapter(this.context as Context, arrFood)

        return view

    }
}