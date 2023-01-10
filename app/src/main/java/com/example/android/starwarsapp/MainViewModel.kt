package com.example.android.starwarsapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var _characters = MutableLiveData<List<Character>>();

    val characters: LiveData<List<Character>>
        get() = _characters

    init {

    }
}