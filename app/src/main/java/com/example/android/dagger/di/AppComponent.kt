package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginSubComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import com.example.android.dagger.user.UserSubComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

/**
 * @author PG.Xie
 * created on 2020/3/20
 */
@Singleton
@Component(modules = [StorageModule::class, AppSubComponent::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    // 2) Expose UserManager so that MainActivity and SettingsActivity
    // can access a particular instance of UserComponent
    fun userManager(): UserManager

    fun loginComponent(): LoginSubComponent.Factory
    fun registrationComponent(): RegistrationComponent.Factory
}

@Module(subcomponents = [RegistrationComponent::class, LoginSubComponent::class, UserSubComponent::class])
interface AppSubComponent {

}