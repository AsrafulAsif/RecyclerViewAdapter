package com.asif.navigationcomponent.homepage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.asif.navigationcomponent.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy


class QserviceAdapter(
    private val context: Context,
    private var list: List<Qservicedataclass>
) : RecyclerView.Adapter<QserviceAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name : TextView = view.findViewById(R.id.serviceName)
        val image : ImageView = view.findViewById(R.id.serviceImg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]

        Glide.with(context)
            .load(data.serviceImage)
            .placeholder(R.drawable.ic_place_holder)
            .error(R.drawable.ic_place_holder)
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .into(holder.image)
        holder.name.text = data.serviceName

    }

}