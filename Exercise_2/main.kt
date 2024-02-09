package Exercise_2

fun main() {
    // Creating instances of Computer, Laptop, and SmartPhone
    val computer: Computer = Computer("001", 8500.0, "Black")
    val laptop: Laptop = Laptop("428", 5666.0, "White", false)
    val contactList: MutableList<String> = mutableListOf("12344321", "12345678", "87654321")
    val smartPhone: SmartPhone = SmartPhone("X3901", 2999.95, "Red", contactList)

    // Store the instances in a list (Possible because of polymorphism)
    val devices: List<Computer> = listOf(computer, laptop, smartPhone)

    // Display the list with forEach and lamba expression (Just because)
    println("Devices BEFORE being manipulated")
    devices.forEach { println(it) }

    // Modifying each device in a way that demonstrates the polymorphism concept
    println("\nDevices AFTER being manipulated")
    for (device in devices) {
        device.changeColor("Yellow")
        device.updatePrice(1000.0)

        // Perform specific actions based on the type of device
        when (device) {
            is Laptop -> device.toggleLid()
            is SmartPhone -> {
                device.addContact("01020304")
                device.removeContact("12344321")
            }
        }

        // Displays the updated device
        println(device)
    }

}