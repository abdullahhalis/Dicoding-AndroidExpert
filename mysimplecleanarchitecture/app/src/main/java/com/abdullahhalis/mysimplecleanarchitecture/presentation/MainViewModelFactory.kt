package com.abdullahhalis.mysimplecleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.abdullahhalis.mysimplecleanarchitecture.di.Injection
import com.abdullahhalis.mysimplecleanarchitecture.domain.MessageUseCase

class MainViewModelFactory(private var messageUseCase: MessageUseCase): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel Class" + modelClass.name)
        }
    }


    companion object{
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this){
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }
}