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
 *@create 23-05-2024 12:50
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
@Dao
interface LoginDao {

    // UNA TAREA

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLogin(task:LoginWallet)

    // LISTADO DE TAREAS
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllLogin(taskList :List<LoginWallet>)

    //ACTUALIZAR
    @Update
    suspend fun updateLogin(task:LoginWallet)

    @Query("SELECT * FROM task_login")
    fun getAllLogin(): LiveData<List<LoginWallet>>

}