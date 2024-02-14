package Exercise_5_Optional

open class Car (
    protected val speed: Double,
    protected val regularPrice: Double,
    protected val color: String,
) {

    open fun getSalePrice() : Double {
        return regularPrice
    }

    override fun toString(): String {
        return "Car(speed=$speed, regularPrice=$regularPrice, color='$color')"
    }
}