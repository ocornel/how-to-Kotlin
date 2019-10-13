fun main() {
    println("Enter score")
    var score:Int = readLine()!!.toInt()

    println("Pass or Fail...")
    if (score >= 50)                        // great or equal to 50
        println("Pass")
    else
        println("Fail")

    // Switch case alternative in kotlin. (Like switch in java when you have multiple options)

    println("Grade")
    when(score) {
        0 -> println("X")               // absolute value
        in 1..20 -> println("E")        // range
        in 21..40 -> println("D")
        in 41..60 -> println("C")
        in 61..80 -> println("B")
        in 81..100 -> println("A")
        else -> println("Y")            // default
    }

}