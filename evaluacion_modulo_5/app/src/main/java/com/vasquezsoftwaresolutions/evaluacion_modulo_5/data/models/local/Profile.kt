package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import androidx.room.Entity
import androidx.annotation.NonNull
import androidx.room.PrimaryKey
/**
 *@autor Pablo
 *@create 22-05-2024 12:11
 *@project evaluacion_modulo_5
 *@Version 1.0
 */

@Entity(tableName = "profile_table")
data class Profile(

    val idProfile: Int =0,
    val task :String,
    val descripcion: String,
    val date: String
)
