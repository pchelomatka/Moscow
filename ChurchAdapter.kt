package com.example.tbilisi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ChurchAdapter(var context: Context, var chirch: ArrayList<Church>) : BaseAdapter() {

    private class ViewHolder(row: View?) {
        var txtName: TextView
        var ivImage: ImageView

        init {
            this.txtName = row?.findViewById(R.id.txtName) as TextView
            this.ivImage = row?.findViewById(R.id.ivImage) as ImageView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewHolder : ViewHolder
        if(convertView == null) {
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.item_list, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }
        else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var chirch: Church = getItem(position) as Church
        viewHolder.txtName.text = chirch.name
        viewHolder.ivImage.setImageResource(chirch.image)

        return  view as View

    }

    override fun getItem(position: Int): Any {
        return chirch.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return  chirch.count()
    }
}