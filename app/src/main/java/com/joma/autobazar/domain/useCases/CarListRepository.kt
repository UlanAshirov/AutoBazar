package com.joma.autobazar.domain.useCases

import androidx.lifecycle.LiveData
import com.joma.autobazar.domain.model.CarModel

interface CarListRepository {
    fun getCarList(): LiveData<List<CarModel>>
}