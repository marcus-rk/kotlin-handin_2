package Exercise_3

fun main() {
    // Creating instances of Shoe, TShirt, and Book
    val shoe = Shoe("Adidas", 599.95, 12)
    val tShirt = TShirt("H&M", -500.0, 5) // price = 0
    val book = Book("The Basics of User Experience", 399.99, 2)

    // Store the instances in a list (Possible because of polymorphism -> all Product)
    val products: List<Product> = listOf(shoe, tShirt, book)

    // Display object and identifyProductCategory() override
    for (product in products) {
        println(product.toString())
        println(product.identifyProductCategory())
    }
}