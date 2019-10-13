// Reuse code from super class or parent class to child class
open class Restaurant {                     // by default in kotlin, classes are final. open maked the class inheritable
    var name = ""

    init {
        name = "Moriah Grilled Vegetables"
    }
    fun show_details() {
        println("Name $name")
    }
}

class MyRestaurant : Restaurant()  {            // The colon : is used to inherit from other classes
    fun display() {
        println("Hello from child $name")
    }
}

fun main() {
    var restaurant = MyRestaurant()
    restaurant.display()
    restaurant.show_details()
}