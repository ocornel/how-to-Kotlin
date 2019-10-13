// Reuse code from super class or parent class to child class
open class Restaurant {                     // by default in kotlin, classes are final. open maked the class inheritable
    var name = ""

    init {
        name = "Moriah Grilled Vegetables"
    }
    open fun show_details() {                   // Functions that will be overridden later must be made open. By default they are final.
        println("Name $name")
    }

    fun final_function() {
        // this won't be overridden.
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