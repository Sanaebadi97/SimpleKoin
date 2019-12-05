package test.test.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel
import test.test.koin.model.Student
import test.test.koin.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    val viewModel by inject<MainViewModel>()
    val student2 by inject<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = get<Student>()
        student.beSmart()


       // val student2 = get<Student>()
        student2.beSmart()

//        val viewModel = getViewModel<MainViewModel>()
//        viewModel.performAction()

        doSomeThing()

    }

    fun doSomeThing() {
        viewModel.performAction()
    }
}
