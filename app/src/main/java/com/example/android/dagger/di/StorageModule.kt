package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/**
 * @author PG.Xie
 * created on 2020/3/20
 */

@Module
interface StorageModule {

    @Binds
    fun provideStorage(impl: SharedPreferencesStorage): Storage
}