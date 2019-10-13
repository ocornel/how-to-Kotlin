// Two function with same name and parameters one in super other in sub. The one in sub should modify behavior of super
class ARestaurant : Restaurant() {
    override fun show_details() {               // use the override in sub class and open in the parent class's function
        println("Restaurant Name is $name")
    }
}

fun main() {
    var restaurant = ARestaurant()
    var originalRestaurant = Restaurant()
    println("From sub class")
    restaurant.show_details()
    println("From super class")
    originalRestaurant.show_details()

}