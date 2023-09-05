package com.example.wallpaperapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wallpaperapp.R

class WallPaperAdapter(
    val context: Context,
   val thumbs: MutableList<String>
) : RecyclerView.Adapter<WallPaperAdapter.WallHolder>() {

    class WallHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      val thumb = itemView.findViewById<ImageView>(R.id.thumb)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_wallpaper, parent, false)
        return WallHolder(view)
    }

    override fun onBindViewHolder(holder: WallHolder, position: Int) {
        Glide.with(context)
            .load(thumbs[position])
            .into(holder.thumb)
    }

    override fun getItemCount(): Int {
        return 36
    }
}



