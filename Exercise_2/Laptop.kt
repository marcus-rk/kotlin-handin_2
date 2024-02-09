package Exercise_2

// Note to self: private val/var is not needed, thus they inherent from super-class
class Laptop(
    private val productID: String,
    private var price: Double,
    private var color: String,
    private var hasOpenLid: Boolean = false
) : Computer(productID, price, color) {

    fun toggleLid(): Unit {
        this.hasOpenLid = !hasOpenLid
    }

    override fun toString(): String {
        return super.toString().dropLast(1) + ", hasOpenLid=${this.hasOpenLid}]"
    }

}