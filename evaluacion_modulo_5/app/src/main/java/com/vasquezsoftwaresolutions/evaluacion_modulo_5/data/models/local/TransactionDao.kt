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
 *@create 23-05-2024 20:45
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
@Dao
interface TransactionDao {

    // UNA Account

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaction(transaction: Transaction)

    // LISTADO DE Account
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllTransaction(transactionList: List<Transaction>)

    //ACTUALIZAR
    @Update
    suspend fun updateTransaction(transaction: Transaction)

    //ELIMINAR una Transaction recibe en el constructor una Transaction
    @Delete
    suspend fun deleteTransaction(transaction: Transaction)

    @Query("DELETE FROM transaction_table")
    suspend fun deleteAllTransaction()


    @Query("SELECT * FROM transaction_table WHERE idTransaction = :mId")
    fun getTransactionById(mId: Int): LiveData<Transaction>


    @Query("SELECT * FROM transaction_table")
    fun getAllTransaction(): LiveData<List<Transaction>>
}