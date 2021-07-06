package com.example.fibactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class Number_fibo( var numbersList:List<BigInteger>):RecyclerView.Adapter<Number_fibo.NumberRecyclerView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberRecyclerView {
        var num =
            LayoutInflater.from(parent.context).inflate(R.layout.numbers_item_list, parent, false)
        return NumberRecyclerView(num)


    }

    override fun onBindViewHolder(holder: NumberRecyclerView, position: Int) {
        holder.etNumbers.text = numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size

    }

    class NumberRecyclerView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var etNumbers = itemView.findViewById<TextView>(R.id.etNumbers)

    }
}
