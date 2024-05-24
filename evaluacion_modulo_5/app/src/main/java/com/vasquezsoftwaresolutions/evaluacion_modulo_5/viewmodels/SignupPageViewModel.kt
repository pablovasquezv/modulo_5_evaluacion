package com.vasquezsoftwaresolutions.evaluacion_modulo_5.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.Account
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.AccountRepository
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.WalletDataBase
import kotlinx.coroutines.launch

/**
 *@autor Pablo
 *@create 23-05-2024 19:29
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
class SignupPageViewModel (application: Application) : AndroidViewModel(application) {
    private val repository: AccountRepository

    val allLogin: LiveData<List<Account>>

    init {
        Log.i("viewModel", "CreateViewModel")
        val accountDao = WalletDataBase.getDatabase(application).getAccountDao()
        repository = AccountRepository(accountDao)
        allLogin = repository.listAllAccount
    }

    // INSERT
    fun inserAccount(account: Account) = viewModelScope.launch {
        repository.insertAccount(account)
    }

    // DELETE ALL
    fun deleteAllAccount()= viewModelScope.launch {
        repository.deleteAllAccount()
    }
    // DELETE WHERE
    fun deleteAccount(account: Account)= viewModelScope.launch{

        repository.deleteAccount(account)
    }

    // UPDATE
    fun updateAccount(account: Account)= viewModelScope.launch {

        repository.updateAccount(account)
    }
}