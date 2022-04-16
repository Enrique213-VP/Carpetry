package recycler.android.svape.mueblecitos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import recycle.android.svape.mueblecitos.model.data.Datasource
import recycler.android.svape.mueblecitos.adapter.ItemAdapter
import recycler.android.svape.mueblecitos.databinding.ActivityListFurnitureBinding

class Bed_List : AppCompatActivity() {
    private lateinit var binding: ActivityListFurnitureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListFurnitureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        val dataSet = Datasource().loadBed()
        val adapter = ItemAdapter(this, dataSet )
        binding.rvImages.layoutManager = GridLayoutManager(this, 2)
        binding.rvImages.adapter = adapter
    }
}