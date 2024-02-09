package Exercise_3

// Exercise does not specify if Product should be open or abstract.
abstract class Product(
    private val name: String,
    private var price: Double,
    private var quantity: Int
) {
    init {
        this.price = if (price > 0) price else 0.0
    }
    abstract fun identifyProductCategory(): String
    override fun toString(): String {
        return "[name='$name', price=$price, quantity=$quantity]"
    }
}