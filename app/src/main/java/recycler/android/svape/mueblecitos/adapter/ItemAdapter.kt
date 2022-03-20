package recycler.android.svape.mueblecitos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import recycle.android.svape.mueblecitos.model.Furniture
import recycler.android.svape.mueblecitos.R
import recycler.android.svape.mueblecitos.databinding.ItemFurnitureBinding
import recycler.android.svape.mueblecitos.list_furniture


class ItemAdapter(val context: Context, val dataSet: List<Furniture>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun getItemCount(): Int = dataSet.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //Create new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_furniture, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.render(dataSet[position])
    }


    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){

        //val imageView: ImageView = view.findViewById(R.id.cardImage)
        fun render(dataSet: Furniture){
            val binding = ItemFurnitureBinding.bind(view)
            Picasso.get().load(dataSet.url).into(binding.cardImage)
        }



    }

}