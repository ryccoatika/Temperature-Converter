package com.ryccoatika.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val viewModel = MainViewModel()
    private lateinit var scaleChooserDialog: MaterialAlertDialogBuilder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        scaleChooserDialog = MaterialAlertDialogBuilder(this).apply {
            setItems(R.array.scale) { _, pos ->
                val scales = resources.obtainTypedArray(R.array.scale) // typedarray is for get the resource from array, instead getting the string
                viewModel.setScale(scales.getResourceId(pos, 0))
                scales.recycle()
            }
        }
}