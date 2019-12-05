package test.test.koin.model

class Student(val course: SchoolCourse, val friend: Friend) {

    fun beSmart() {
        course.study()
        friend.hangout()
    }

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