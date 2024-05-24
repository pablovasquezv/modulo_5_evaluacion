package com.vasquezsoftwaresolutions.evaluacion_modulo_5.data.models.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 *@autor Pablo
 *@create 23-05-2024 12:52
 *@project evaluacion_modulo_5
 *@Version 1.0
 */
@Database(entities = [LoginWallet::class, Account::class, Transaction::class], version = 1, exportSchema = false)
abstract class WalletDataBase : RoomDatabase()  {
    // Agrego las referencias
    abstract fun getLoginDao(): LoginDao
    abstract fun getAccountDao(): AccountDao

    abstract fun getTransactionDao():TransactionDao

    companion object {
        @Volatile
        private var INSTANCE: WalletDataBase? = null

        fun getDatabase(context: Context): WalletDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WalletDataBase::class.java,
                    "AlkeWallet"
                ).build()

                INSTANCE = instance
                return instance
            }
        }

    }
}