package test.test.koin.viewModel

import androidx.lifecycle.ViewModel
import test.test.koin.model.Friend
import test.test.koin.model.SchoolCourse

class MainViewModel(val course: SchoolCourse, val friend: Friend) : ViewModel() {

    fun performAction(){

    }
}