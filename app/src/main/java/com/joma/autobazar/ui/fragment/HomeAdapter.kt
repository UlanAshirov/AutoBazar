package com.joma.autobazar.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.joma.autobazar.databinding.ItemCarBinding
import com.joma.autobazar.domain.model.CarModel

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    private var carList = mutableListOf<CarModel>()

    fun setCarList(carList: MutableList<CarModel>) {
        this.carList.clear()
        this.carList.addAll(carList)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding: ItemCarBinding = ItemCarBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.onBind(carList[position])
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    class HomeViewHolder(private val binding: ItemCarBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(carModel: CarModel) {
            Glide.with(binding.root).load(carModel.image).centerCrop().into(binding.imgItemCar)
            binding.tvItemCost.text = carModel.cost
            binding.tvItemBrand.text = carModel.brand
            binding.tvItemModel.text = carModel.model
            binding.tvItemYear.text = carModel.year
        }
    }
}