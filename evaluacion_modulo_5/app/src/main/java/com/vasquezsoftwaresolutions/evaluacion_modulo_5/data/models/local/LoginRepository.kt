package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import androidx.lifecycle.LiveData

/**
 *@autor Pablo
 *@create 23-05-2024 13:03
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
class LoginRepository (private val loginDao: LoginDao){

    // Este value va a contener todos los datos desde la BBDD
    val listAllLogin :LiveData<List<LoginWallet>> = loginDao.getAllLogin()

}