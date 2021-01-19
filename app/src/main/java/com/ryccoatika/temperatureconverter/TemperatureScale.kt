package com.ryccoatika.temperatureconverter

import androidx.annotation.StringRes

sealed class TemperatureScale(
    @StringRes
    val stringRes: Int
) {
    object Celcius: TemperatureScale(R.string.celsius)
    object Fahrenheit: TemperatureScale(R.string.fahrenheit)
    object Kelvin: TemperatureScale(R.string.kelvin)
}