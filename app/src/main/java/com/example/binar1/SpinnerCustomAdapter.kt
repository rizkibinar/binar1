package com.example.binar1

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class SpinnerCustomAdapter(private val context: Context, var dataSet: Array<String>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = inflater.inflate(R.layout.text_row_item, parent, false)
        val vh = ItemHolder(view)

        vh.label.text = dataSet[position]
        vh.numberCount.text = position.toString()
        if(position % 2 == 0)
            vh.numberCount.setTextColor(Color.parseColor("#1bafad"))
        else
            vh.numberCount.setTextColor(Color.parseColor("#000000"))

        return view
    }

    override fun getItem(position: Int): Any? {
        return dataSet[position];
    }

    override fun getCount(): Int {
        return dataSet.size;
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    private class ItemHolder(row: View?) {
        val label: TextView = row?.findViewById(R.id.text_row) as TextView
        val numberCount: TextView = row?.findViewById(R.id.number_count) as TextView


    }

}