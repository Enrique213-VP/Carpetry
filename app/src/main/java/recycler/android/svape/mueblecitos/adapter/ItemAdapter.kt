package recycler.android.svape.mueblecitos.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import recycler.android.svape.mueblecitos.model.Furniture
import recycler.android.svape.mueblecitos.ImageFullActivity
import recycler.android.svape.mueblecitos.R
import recycler.android.svape.mueblecitos.databinding.ItemFurnitureBinding



class ItemAdapter(val context: Context, val dataSet: List<Furniture>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun getItemCount(): Int = dataSet.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //Create new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_furniture, parent, false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val path = dataSet[position]
        holder.render(dataSet[position])

        holder.itemView?.setOnClickListener{
            val intent = Intent(context, ImageFullActivity::class.java)
            intent.putExtra("path", path.url )
            context.startActivity(intent)
        }


    }


    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){

        //val imageView: ImageView = view.findViewById(R.id.cardImage)


        fun render(dataSet: Furniture){
            val binding = ItemFurnitureBinding.bind(view)
            Picasso.get().load(dataSet.url).into(binding.cardImage)

        }



    }

}