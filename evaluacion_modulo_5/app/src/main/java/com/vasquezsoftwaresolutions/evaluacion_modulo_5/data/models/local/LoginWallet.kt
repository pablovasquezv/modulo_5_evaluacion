package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import androidx.room.Entity
import androidx.annotation.NonNull
import androidx.room.PrimaryKey

/**
 *@autor Pablo
 *@create 23-05-2024 13:50
 *@project evaluacion_modulo_5
 *@Version 1.0
 */

@Entity(tableName = "task_login")
data class LoginWallet (
    @PrimaryKey(autoGenerate = true)
    @NonNull
    val idLogin: Int =0,
    val emailLogin :String,
    val passwordLogin: String,

)