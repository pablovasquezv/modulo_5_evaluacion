package com.vasquezsoftwaresolutions.evaluacion_modulo_5.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.LoginRepository
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.LoginWallet
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.WalletDataBase

/**
 *@autor Pablo
 *@create 21-05-2024 23:17
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
class LoginPageViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel

    private val repository: LoginRepository

    val allLogin: LiveData<List<LoginWallet>>

    init {
        Log.i("viewModel", "CreateViewModel")
        val loginDao = WalletDataBase.getDatabase(application).getLoginDao()
        repository = LoginRepository(loginDao)
        allLogin = repository.listAllLogin
    }
}