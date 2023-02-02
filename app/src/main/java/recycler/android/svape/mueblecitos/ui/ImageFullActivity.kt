package recycler.android.svape.mueblecitos.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import recycler.android.svape.mueblecitos.databinding.ActivityImageFullBinding

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
        Glide.with(this).load(imagePath).into(binding.imageFurnitureBig)
        }



}