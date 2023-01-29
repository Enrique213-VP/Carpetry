package recycler.android.svape.mueblecitos.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import recycler.android.svape.mueblecitos.model.Furniture
import recycler.android.svape.mueblecitos.adapter.ItemAdapter
import recycler.android.svape.mueblecitos.databinding.ActivityImageFullBinding
import recycler.android.svape.mueblecitos.databinding.ItemFurnitureBinding

class ImageFullActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageFullBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageFullBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener{
            onBackPressed()
        }

        val imagePath = intent.getStringExtra("path")
        Picasso.get().load(imagePath).into(binding.imageFurnitureBig)
        }



}