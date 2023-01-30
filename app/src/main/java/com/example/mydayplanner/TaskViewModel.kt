package com.example.mydayplanner

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel: ViewModel() {
    var name  = MutableLiveData<String>()
    var desc  = MutableLiveData<String>()
}