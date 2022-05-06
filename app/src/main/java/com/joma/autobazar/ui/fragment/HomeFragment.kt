package com.joma.autobazar.ui.fragment

import android.os.Bundle
import android.view.View
import com.joma.autobazar.R
import com.joma.autobazar.base.BaseFragment
import com.joma.autobazar.databinding.FragmentHomeBinding
import com.joma.autobazar.domain.model.CarModel
import com.joma.autobazar.showToast

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private lateinit var adapter: HomeAdapter
    private var list: MutableList<CarModel> = mutableListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
        initListeners()
    }

    private fun initList() {
        list.add(CarModel(R.drawable.car1, "mercedes", "20000", "2017", "AMG1"))
        list.add(CarModel(R.drawable.car2, "Тайота", "20000", "2017", "AMG2"))
        list.add(CarModel(R.drawable.car3, "БМВ", "20000", "2017", "AMG3"))
        list.add(CarModel(R.drawable.car4, "Тесла", "15000", "2017", "AMG4"))
        list.add(CarModel(R.drawable.moto1, "Мото1", "13000", "2017", "Харлей1"))
        list.add(CarModel(R.drawable.moto2, "Мото2", "10000", "2017", "Харлей2"))
        adapter.setCarList(list)
    }

    private fun initListeners() {
        openCategoryDialog()
        isEnabled()
    }

    private fun isEnabled() {

    }

    private fun openCategoryDialog() {
        binding.btnCategory.setOnClickListener {

        }
    }

    override fun setupUI() {
        adapter = HomeAdapter()
        binding.rvCar.adapter = adapter
    }

    override fun setupObservers() {
    }
}