package recycler.android.svape.mueblecitos

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import recycler.android.svape.mueblecitos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {




    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.layoutChair.setOnClickListener{
            val intent = Intent(this, Chairs_List::class.java)
            Toast.makeText(this, "Ingresaste a sillas", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.layoutCloset.setOnClickListener{
            val intent = Intent(this, list_furniture::class.java)
            Toast.makeText(this, "Ingresaste a closet", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.layoutAboutMe.setOnClickListener{
            val intent = Intent(this, construc::class.java)
            Toast.makeText(this, "Bienvenido oís", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }


    }

}