package com.example.news

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private val newsList : ArrayList<News>, private val context: Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text=currentItem.heading
        holder.newsLayout.setOnClickListener {
            Toast.makeText(context,currentItem.heading,Toast.LENGTH_SHORT).show()
        }
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
            val titleImage : ShapeableImageView =itemView.findViewById(R.id.title_image)
            val tvHeading : TextView =itemView.findViewById(R.id.tv_Heading)
        val newsLayout: ConstraintLayout =itemView.findViewById(R.id.newsLayout)
    }
}