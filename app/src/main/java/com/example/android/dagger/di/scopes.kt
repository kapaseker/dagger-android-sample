package com.example.android.dagger.di

import javax.inject.Scope

/**
 * @author PG.Xie
 * created on 2020/3/20
 */

@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope


@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class LoggedUserScope