package com.svape.carpetry.renovar.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.svape.carpetry.renovar.R
import com.svape.carpetry.renovar.databinding.ItemFurnitureBinding
import com.svape.carpetry.renovar.model.Furniture
import com.svape.carpetry.renovar.ui.ImageFullActivity


class ItemAdapter(val context: Context, val dataSet: List<Furniture>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun getItemCount(): Int = dataSet.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //Create new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_furniture, parent, false)
        return ItemViewHolder(adapterLayout, parent.context)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val path = dataSet[position]
        holder.render(dataSet[position])

        holder.itemView?.setOnClickListener {
            val intent = Intent(context, ImageFullActivity::class.java)
            intent.putExtra("path", path.url)
            context.startActivity(intent)
        }
    }

    class ItemViewHolder(private val view: View, private val context: Context) :
        RecyclerView.ViewHolder(view) {
        fun render(dataSet: Furniture) {
            val binding = ItemFurnitureBinding.bind(view)
            //Picasso.get().load(dataSet.url).into(binding.cardImage)
            Glide.with(context).load(dataSet.url).centerCrop().into(binding.cardImage)

        }
    }

}