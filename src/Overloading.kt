// Concept of overloading is having multiple functions with same name but different parameters
class Calc {

    fun sum(x:Int, y:Int) {
        println(x + y)
    }

    fun sum(x:Int, y:Int, z:Int) {
        println(x + y + z)
    }

    fun sum(x:String, y:String) {
        println(x + y)
    }
}

fun main() {
    var calc = Calc()

    // same function name. Kotlin will smartly pick the correct function based on variables passed
    calc.sum("Hello", "world")
    calc.sum(10, 6)
    calc.sum(6,9,5)

}
