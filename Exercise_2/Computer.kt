package Exercise_2

open class Computer (
    private val productID: String,
    private var price: Double,
    private var color: String
) {
    init {
        this.price = if (price > 0) price else 0.0
    }

    fun updatePrice(newPrice: Double) {
        this.price = if (newPrice > 0) newPrice else 0.0
    }

    fun changeColor(newColor: String) {
        this.color = newColor
    }

    override fun toString(): String {
        return "[productID=$productID, price=$price, color='$color']"
    }

}