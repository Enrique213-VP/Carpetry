package com.svape.carpetry.renovar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.svape.carpetry.renovar.model.data.Datasource
import com.svape.carpetry.renovar.adapter.ItemAdapter
import com.svape.carpetry.renovar.databinding.ActivityListFurnitureBinding


class Nightstand_List : AppCompatActivity() {
    private lateinit var binding: ActivityListFurnitureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListFurnitureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
        buttonBack()
    }


    private fun buttonBack() {
        binding.buttonBack.setOnClickListener{
            onBackPressed()
        }
    }
    private fun setUpRecyclerView() {
        val dataSet = Datasource().loadNightstand()
        val adapter = ItemAdapter(this, dataSet )
        binding.rvImages.layoutManager = GridLayoutManager(this, 2)
        binding.rvImages.adapter = adapter
    }
}