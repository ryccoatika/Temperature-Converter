package com.ryccoatika.temperatureconverter

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val scale = MutableLiveData<TemperatureScale>()

}