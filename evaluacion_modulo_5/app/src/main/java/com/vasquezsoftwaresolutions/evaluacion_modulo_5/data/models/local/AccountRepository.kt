package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import androidx.lifecycle.LiveData

/**
 *@autor Pablo
 *@create 23-05-2024 18:59
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
class AccountRepository(private val accountDao: AccountDao) {

    // Este value va a contener todos los datos desde la BBDD

    val listAllAccount: LiveData<List<Account>> = accountDao.getAllAccount()

    // insert
    suspend fun insertAccount(account: Account) {
        accountDao.insertAccount(account)
    }

    // delete una tarea sólo 1
    suspend fun deleteAccount(account: Account) {
        accountDao.deleteAccount(account)
    }

    // Borra todos los datos que hay!
    suspend fun deleteAllAccount() {
        accountDao.deleteAllAccount()
    }

    // actualizar
    suspend fun updateAccount(task: Account) {
        accountDao.updateAccount(task)
    }

}