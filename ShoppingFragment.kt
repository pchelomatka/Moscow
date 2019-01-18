package com.example.tbilisi

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class ShoppingFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_shopping, container, false)
        var listView = view.findViewById<ListView>(R.id.shoppinglistView) as ListView
        var arrShopping: ArrayList<Shopping> = ArrayList()

        arrShopping.add(Shopping("Новинский пассаж",  R.drawable.noc))
        arrShopping.add(Shopping("«Сфера»на Новом Арбате и Кутузовской",  R.drawable.fera))
        arrShopping.add(Shopping("«Модный сезон»на Охотном ряду",  R.drawable.mod))

        listView.adapter = ShoppingAdapter(this.context as Context, arrShopping)

        return view

    }
}