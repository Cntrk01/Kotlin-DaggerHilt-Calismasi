package com.example.kotlin_hilt

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunction():String
}

@InstallIn(ActivityComponent::class)
@Module
class MyModule{
    @ActivityScoped
    @Provides
    fun providerFunc():MyInterface{
        return InterfaceImplementor()
    }
    @SecondImplementor
    @ActivityScoped
    @Provides
    fun secondProviderFunction():MyInterface{
        return SecondInterfaceImplementor()
    }
    @ActivityScoped
    @Provides
    fun gson():Gson{
        return  Gson()
    }
}
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor