package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import androidx.lifecycle.LiveData

/**
 *@autor Pablo
 *@create 23-05-2024 20:46
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
class TransactionRepository(private val transactionDao: TransactionDao) {

    // Este value va a contener todos los datos desde la BBDD

    val listAllTransaction: LiveData<List<Transaction>> = transactionDao.getAllTransaction()

    // insert
    suspend fun insertTransaction(transaction: Transaction) {
        transactionDao.insertTransaction(transaction)
    }

    // delete una transaction sólo 1
    suspend fun deleteTransaction(transaction: Transaction) {
        transactionDao.deleteTransaction(transaction)
    }

    // Borra todos los datos que hay!
    suspend fun deleteAllTransaction() {
        transactionDao.deleteAllTransaction()
    }

    // actualizar
    suspend fun updateTransaction(transaction: Transaction) {
        transactionDao.updateTransaction(transaction)
    }

}