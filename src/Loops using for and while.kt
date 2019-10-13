fun main() {
    var x:Int = 1

    println("While loop")
    while (x<=5) {              // while looping
        println(x)
        x++
    }

    println("For loop")
    for (y in 1..10)            // for loop with a range
        println(y)

    println("For reverse loop")
    for(z in 10 downTo 1)       // for reverse looping a range
        println(z)

    println("For loop with steps")
    for (a in 1..10 step 2)     // for loop with intervals/steps
        println(a)
}