package com.joma.autobazar.ui.fragment

import androidx.lifecycle.ViewModel
import com.joma.autobazar.data.CarsRepositoryImpl
import com.joma.autobazar.domain.useCases.getCarList.GetCarListUseCase

class HomeVIewModel: ViewModel() {
    private val repository = CarsRepositoryImpl()
    private val getCarListUseCase = GetCarListUseCase(repository)
}