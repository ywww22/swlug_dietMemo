package com.example.dietmemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<DataModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var convertView = p1
        if(convertView == null){
            convertView = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        val date = convertView?.findViewById<TextView>(R.id.lvDateArea)
        val memo = convertView?.findViewById<TextView>(R.id.lvMemoArea)

        date!!.text = List[p0].date
        memo!!.text = List[p0].memo

        return convertView!!
    }
}