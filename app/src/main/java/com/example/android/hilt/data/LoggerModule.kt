package com.example.android.hilt.data

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class LoggerModule {

    @Binds
    abstract fun bindLoggerDataSource(loggerLocalDataSource: LoggerLocalDataSource): LoggerDataSource
}