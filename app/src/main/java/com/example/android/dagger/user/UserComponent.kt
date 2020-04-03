package com.example.android.dagger.user

import com.example.android.dagger.di.LoggedUserScope
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

/**
 * @author PG.Xie
 * created on 2020/3/20
 */

@LoggedUserScope
@Subcomponent
interface UserSubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserSubComponent
    }

    fun inject(act: MainActivity)
    fun inject(act: SettingsActivity)
}