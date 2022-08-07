package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>(){
    val fruitsList = listOf<String>("Mango","Apple","Banana","Orange","Guava","Lemon","Pear")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitsList[position]
        holder.myTextView.text = fruit
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

}

class MyViewHolder(val view:View):RecyclerView.ViewHolder(view){
    val myTextView = view.findViewById<TextView>(R.id.tvName)
}