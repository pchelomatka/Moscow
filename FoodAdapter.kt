package com.example.tbilisi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class FoodAdapter(var context: Context, var food: ArrayList<Food>) : BaseAdapter() {

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

        var food: Food = getItem(position) as Food
        viewHolder.txtName.text = food.name
        viewHolder.ivImage.setImageResource(food.image)

        return  view as View

    }

    override fun getItem(position: Int): Any {
        return food.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return  food.count()
    }
}