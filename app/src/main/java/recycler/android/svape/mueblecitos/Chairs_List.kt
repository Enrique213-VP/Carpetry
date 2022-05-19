package recycler.android.svape.mueblecitos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import recycle.android.svape.mueblecitos.model.data.Datasource
import recycler.android.svape.mueblecitos.adapter.ItemAdapter
import recycler.android.svape.mueblecitos.databinding.ActivityListFurnitureBinding

class Chairs_List : AppCompatActivity() {
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
        val dataSet = Datasource().loadChairs()
        val adapter = ItemAdapter(this, dataSet )
        binding.rvImages.layoutManager = GridLayoutManager(this, 2)
        binding.rvImages.adapter = adapter
    }
}