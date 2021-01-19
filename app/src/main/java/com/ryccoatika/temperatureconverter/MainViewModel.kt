package com.ryccoatika.temperatureconverter

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val scale = MutableLiveData<TemperatureScale>()

    fun setScale(stringRes: Int) {
        when(stringRes) {
            R.string.celsius -> scale.postValue(TemperatureScale.Celcius)
            R.string.fahrenheit -> scale.postValue(TemperatureScale.Fahrenheit)
            R.string.kelvin -> scale.postValue(TemperatureScale.Kelvin)
            else -> scale.postValue(TemperatureScale.Celcius)
        }
    }
}