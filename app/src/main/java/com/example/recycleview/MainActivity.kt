package com.example.recycleview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList = listOf<Fruit>(
        Fruit("Mango", "Joe"),
        Fruit("Apple","Frank"),
        Fruit("Banana","Ali"),
        Fruit("Orange","Ola"),
        Fruit("Guava","Helga"),
        Fruit("Lemon","Alex"),
        Fruit("Pear","Nik"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecycleView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(
            fruitsList,
        ) { selectedItem: Fruit ->
            listItemClicker(selectedItem)
        }
    }

    private fun listItemClicker(fruit: Fruit){
        Toast.makeText(
            this@MainActivity,
            "Supplier is : ${fruit.supplier}",
            Toast.LENGTH_SHORT
        ).show()
    }
}