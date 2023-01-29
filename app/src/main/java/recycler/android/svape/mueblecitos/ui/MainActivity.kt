package recycler.android.svape.mueblecitos.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import recycler.android.svape.mueblecitos.databinding.ActivityMainBinding
import recycler.android.svape.mueblecitos.ui.chairs.Armchair_List
import recycler.android.svape.mueblecitos.ui.chairs.Chairs_List

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

        binding.layoutKitchen.setOnClickListener{
            val intent = Intent(this, Kitchen_List::class.java)
            Toast.makeText(this, "Ingresaste a cocinas", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.layoutDoor.setOnClickListener{
            val intent = Intent(this, Door_List::class.java)
            Toast.makeText(this, "Ingresaste a puertas", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.layoutNightstand.setOnClickListener{
            val intent = Intent(this, Nightstand_List::class.java)
            Toast.makeText(this, "Ingresaste a mesistas", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.layoutDressingTable.setOnClickListener{
            val intent = Intent(this, Dresser_List::class.java)
            Toast.makeText(this, "Ingresaste a tocadores", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.layoutBed.setOnClickListener{
            val intent = Intent(this, Bed_List::class.java)
            Toast.makeText(this, "Ingresaste a camas", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.layoutCloset.setOnClickListener{
            val intent = Intent(this, Closet_List::class.java)
            Toast.makeText(this, "Ingresaste a closet", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.Armchair.setOnClickListener{
            val intent = Intent(this, Armchair_List::class.java)
            Toast.makeText(this, "Ingresaste a salas y sillones", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }


        binding.layoutOther.setOnClickListener{
            val intent = Intent(this, Others_List::class.java)
            Toast.makeText(this, "Otros trabajos", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.layoutAboutMe.setOnClickListener{
            val intent = Intent(this, AboutMe::class.java)
            Toast.makeText(this, "Bienvenido oís", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }


    }

}