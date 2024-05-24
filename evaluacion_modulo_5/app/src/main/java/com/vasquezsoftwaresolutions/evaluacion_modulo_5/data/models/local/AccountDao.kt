package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import androidx.room.Dao
import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

/**
 *@autor Pablo
 *@create 23-05-2024 18:43
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
@Dao
interface AccountDao {

    // UNA Account

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAccount(account:Account)

    // LISTADO DE Account
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllAccount(accountList :List<Account>)

    //ACTUALIZAR
    @Update
    suspend fun updateAccount(account:Account)

    //ELIMINAR una tarea recibe en el constructor una Account
    @Delete
    suspend fun deleteAccount(account:Account)

    @Query("DELETE FROM account_table")
    suspend fun deleteAllAccount()


    @Query("SELECT * FROM account_table WHERE idAccount = :mId")
    fun getTaskById(mId: Int):LiveData<Account>


    @Query("SELECT * FROM account_table")
    fun getAllAccount(): LiveData<List<Account>>
}