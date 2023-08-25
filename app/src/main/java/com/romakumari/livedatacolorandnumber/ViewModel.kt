package com.romakumari.livedatacolorandnumber

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel():ViewModel() {
    var number:MutableLiveData<Int> = MutableLiveData(0)
    var color: MutableLiveData<Int> = MutableLiveData(0)
    var reset: MutableLiveData<Int> =MutableLiveData(0)
}