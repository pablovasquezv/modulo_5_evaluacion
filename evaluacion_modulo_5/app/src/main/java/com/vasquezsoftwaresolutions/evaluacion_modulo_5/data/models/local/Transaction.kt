package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import androidx.room.Entity
import androidx.annotation.NonNull
import androidx.room.PrimaryKey

/**
 *@autor Pablo
 *@create 22-05-2024 12:21
 *@project evaluacion_modulo_5
 *@Version 1.0
 */

@Entity(tableName = "transaction_table")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    val idTransaction: Int = 0,
    val amountTransaction: Long,
    val noteTransaction: String,

    )
