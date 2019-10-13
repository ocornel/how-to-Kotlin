// Static variables have single value for all objects of a class. In kotlin companion is used in place of static key word (as used in languages like java)
class ABC {
    var x:Int=0             // every copy of ABC will have it's own copy of x
    companion object {
        var y:Int=0         // you won't declare an object to use Y. All objects will get the same value of Y
    }
}

fun main() {
    var a=ABC()
    a.x++
    println(a.x)
    var b = ABC()
    b.x++
    println(b.x)

    ABC.y++                 // becomes a pseudo object of ABC
    ABC.y++
    println(ABC.y)

}