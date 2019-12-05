package test.test.koin.model

class Student() {

    val course: SchoolCourse = SchoolCourse()
    val friend: Friend = Friend()

}

class SchoolCourse {
    fun study() {
        println("I am studying")
    }
}

class Friend {
    fun hangout() {
        println("We`r hanging out")
    }
}