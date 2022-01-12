package com.example.android.hilt.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.android.hilt.util.DateFormatter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val dateFormatter: DateFormatter) : ViewModel() {

  fun uselessFunction(){
      Log.d("TAG", "ici: ${dateFormatter.formatDate(12345678)}")
  }

}