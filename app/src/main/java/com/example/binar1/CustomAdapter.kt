package com.example.binar1

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet: Array<String>,val onItemClick : (String) -> Unit) :
        RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View, onItemClick: (String) -> Unit) : RecyclerView.ViewHolder(view) {
        val textItemdiRow: TextView = view.findViewById(R.id.text_row)
        val numberCount: TextView = view.findViewById(R.id.number_count)

        init {
            view.setOnClickListener {
                onItemClick(textItemdiRow.text.toString())
            }
        }
    }

    // dipanggil setiap recyclerview mau bikin 1 item untuk tiap dataSet
    // di fungsi ini kita deklarasi layout yang mau di pakai
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.text_row_item, viewGroup, false)

        return ViewHolder(view, onItemClick)
    }

    // di panggil ketika kita mau set data ke layoutnya
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.textItemdiRow.text = dataSet[position]
        viewHolder.numberCount.text = position.toString()

        if(position % 2 == 0)
            viewHolder.numberCount.setTextColor(Color.parseColor("#1bafad"))
        else
            viewHolder.numberCount.setTextColor(Color.parseColor("#000000"))
    }

    // fungsi ini buat ngasih tau ke adapternya, berapa banyak item yang mau di tampilakan
    override fun getItemCount() = dataSet.size

}