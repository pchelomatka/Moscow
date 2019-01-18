package com.example.tbilisi

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class ChurchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_church, container, false)
        var listView = view.findViewById<ListView>(R.id.churchlistView) as ListView
        var arrChurch: ArrayList<Church> = ArrayList()

        arrChurch.add(
            Church(
                "Арбат",
                R.drawable.arbat
            )
        )
        arrChurch.add(
            Church(
                "Александровский сад",
                R.drawable.sad
            )
        )
        arrChurch.add(
            Church(
                "Архангельский собор",
                R.drawable.sob
            )
        )
        arrChurch.add(
            Church(
                "Большой театр",
                R.drawable.teat
            )
        )
        arrChurch.add(
            Church(
                "Бункер-42 на Таганке",
                R.drawable.bun
            )
        )
        arrChurch.add(
            Church(
                "ВДНХ",
                R.drawable.vdnx
            )
        )

        listView.adapter = ChurchAdapter(this.context as Context, arrChurch)

        return view

    }
}
