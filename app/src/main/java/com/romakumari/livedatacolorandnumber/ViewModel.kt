package com.romakumari.livedatacolorandnumber

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel():ViewModel() {
    var number:MutableLiveData<Int> = MutableLiveData(0)
    var Color: MutableLiveData<Int> = MutableLiveData(0)
}