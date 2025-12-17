package com.example.myapplication.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {
    var height = mutableStateOf("")
    var weight = mutableStateOf("")

    val bmi: Double?
        get() {
            val h = height.value.toDoubleOrNull()
            val w = weight.value.toDoubleOrNull()

            return if (h != null && w != null && h > 0) {
                w / (h * h)
            } else {
                null
            }
        }
}