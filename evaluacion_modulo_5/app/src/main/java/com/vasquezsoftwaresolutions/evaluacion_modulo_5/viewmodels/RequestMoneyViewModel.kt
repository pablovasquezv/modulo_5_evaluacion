package com.vasquezsoftwaresolutions.evaluacion_modulo_5.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.Transaction
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.TransactionRepository
import com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local.WalletDataBase
import kotlinx.coroutines.launch

/**
 *@autor Pablo
 *@create 21-05-2024 23:17
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
class RequestMoneyViewModel (application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel
    private val repository: TransactionRepository

    val allTransaction: LiveData<List<Transaction>>

    init {
        Log.i("viewModel", "CreateViewModel")
        val transactionDao = WalletDataBase.getDatabase(application).getTransactionDao()
        repository = TransactionRepository(transactionDao)
        allTransaction = repository.listAllTransaction
    }

    // INSERT
    fun insertTransaction(transaction: Transaction) = viewModelScope.launch {
        repository.insertTransaction(transaction)
    }

    // DELETE ALL
    fun deleteAllTransaction() = viewModelScope.launch {
        repository.deleteAllTransaction()
    }

    // DELETE WHERE
    fun deleteTransaction(transaction: Transaction) = viewModelScope.launch {

        repository.deleteTransaction(transaction)
    }

    // UPDATE
    fun updateTransaction(transaction: Transaction) = viewModelScope.launch {
        repository.updateTransaction(transaction)
    }
}