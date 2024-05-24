package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *@autor Pablo
 *@create 23-05-2024 18:38
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
@Entity(tableName = "account_table")
data class Account(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    val idAccount: Int =0,
    val firstNameAccount :String,
    val lastNameAccount :String,
    val emailAccount :String,
    val passwordAccount: String,

)
