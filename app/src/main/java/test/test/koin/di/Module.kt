package test.test.koin.di

import org.koin.core.module.Module
import org.koin.dsl.module
import test.test.koin.model.Friend
import test.test.koin.model.SchoolCourse
import test.test.koin.model.Student

val appModule: Module = module {

    //Defines a singleton of SchoolCourses
    single { SchoolCourse() }

    //Defines a factory(Creates new instance every time)
    factory { Friend() }

    factory { Student(get(), get()) }
}