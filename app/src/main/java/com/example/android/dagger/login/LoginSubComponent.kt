package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

/**
 * @author PG.Xie
 * created on 2020/3/20
 */

@ActivityScope
@Subcomponent
interface LoginSubComponent {


    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginSubComponent
    }


    fun inject(activity: LoginActivity)
}