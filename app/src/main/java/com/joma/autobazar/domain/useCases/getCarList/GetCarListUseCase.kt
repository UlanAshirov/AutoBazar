package com.joma.autobazar.domain.useCases.getCarList

import androidx.lifecycle.LiveData
import com.joma.autobazar.domain.model.CarModel
import com.joma.autobazar.domain.useCases.CarListRepository

class GetCarListUseCase(private val repository: CarListRepository) {
    fun getListCar(): LiveData<List<CarModel>> {
        return repository.getCarList()
    }
}