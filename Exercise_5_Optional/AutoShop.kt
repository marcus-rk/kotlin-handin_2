package Exercise_5_Optional

class AutoShop (
    private val carList: MutableList<Car> = mutableListOf()
) {
    fun showCarList(): Unit {
        for (car in carList) {
            println(car.toString())
            println("Price: ${car.getSalePrice()}")
            println()
        }
    }

    fun main() {
        // Create instances of Truck, Ford, and Car
        val truckOne: Truck = Truck(212.8, 100000.0,"Yellow", 1980.5)
        val fordOne: Ford = Ford(230.8, 249999.95, "Black", 1998, false)
        val fordTwo: Ford = Ford(232.5, 270000.0, "White", 2017, true)
        val carOne: Car = Car(423.78, 1000000.00, "Purple")

        // Store the instances in a list (Possible because of polymorphism -> all Car)
        val cars: MutableList<Car> = mutableListOf(truckOne, fordOne, fordTwo, carOne)

        // Creating an autoShop instance with list of cars
        val autoShop: AutoShop = AutoShop(cars)

        // Display objects from autoshop carList and getSalePrice() polymorphism override
        autoShop.showCarList()
    }

}

fun main() {
    val autoShop: AutoShop = AutoShop()
    autoShop.main()
}