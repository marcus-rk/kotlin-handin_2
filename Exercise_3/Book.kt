package Exercise_3

class Book(
    name: String,
    price: Double,
    quantity: Int
) : Product(name, price, quantity) {
    override fun identifyProductCategory(): String {
        return "I am a book"
    }
}