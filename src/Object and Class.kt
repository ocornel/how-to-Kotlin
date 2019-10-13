class Student {                         // defining a class
    var name:String=""                  // setting class attributes
    var marks:Int=0

    fun show() {                        // setting class function
        println("$name scored $marks")
    }
}

fun main(args:Array<String>) {
    var a_student = Student()           // Initializing an object of the class (dont have to use new as done in Java)
    a_student.name = "Martin"           // assigning values to attributes
    a_student.marks = 78

    a_student.show()
}