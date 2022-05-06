package com.joma.autobazar.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.joma.autobazar.domain.model.CarModel
import com.joma.autobazar.domain.useCases.CarListRepository

class CarsRepositoryImpl: CarListRepository {
private val liveData = MutableLiveData<List<CarModel>>()

    override fun getCarList(): LiveData<List<CarModel>> {
        return liveData
    }
}