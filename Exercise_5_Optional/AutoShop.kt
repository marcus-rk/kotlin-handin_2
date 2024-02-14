package Exercise_5_Optional

import Exercise_4.Circle
import Exercise_4.Rectangle
import Exercise_4.Shape
import Exercise_4.Triangle

class AutoShop {
}


fun main() {
    // Create instances of Truck and Ford
    val truck: Truck = Truck(212.8, 105000.0,"Yellow", 1980.5)
    val fordOne: Ford = Ford(230.8, 249999.95, "Black", 1998, false)
    val fordTwo: Ford = Ford(232.5, 270000.0, "White", 2017, true)
    val car: Car = Car(423.78, 1000000.00, "Purple")

    // Store the instances in a list (Possible because of polymorphism -> all Car)
    val cars: List<Car> = listOf(truck, fordOne, fordTwo, car)

    // Display objects and getSalePrice() polymorphism override
    for (car in cars) {
        println(car.toString())
        println("Price: ${car.getSalePrice()}")
        println()
    }
}