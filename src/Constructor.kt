// A constructor is a function to give initial/default values for your class objects

class Employee {
    var name:String=""
    var salary:Int = 0

    constructor() {         // this constructor will assign 5000 as the salary if you never specify salary in employee objects
        salary = 5000
    }

    fun show() {
        println("$name earns $salary")
    }
}

class AStudent
    () {
    var name: String=""
    var score:Int = 0

    init {                              // Initializing values as main constructor using init
        score = 50
    }

    fun show() {
        println("$name scored $score")
    }
}

fun main() {
    var student = AStudent()
    var employee = Employee()
    student.name = "Martin"
    employee.name = "Cornel"
    employee.show()
    student.show()
}
