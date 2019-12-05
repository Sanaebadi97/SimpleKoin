package test.test.koin.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import test.test.koin.viewModel.MainViewModel

val viewModelModule: Module = module {
    viewModel { MainViewModel(get(), get()) }
}