package com.example.android.hilt.di

import android.content.Context
import androidx.room.Room
import com.example.android.hilt.data.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDataBase(@ApplicationContext applicationContext: Context) =
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "logging.db"
        ).build()

    @Provides
    fun provideLogDao(appDatabase: AppDatabase) = appDatabase.logDao()
}