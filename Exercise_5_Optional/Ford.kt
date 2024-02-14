package Exercise_5_Optional

class Ford (
    speed: Double,
    regularPrice: Double,
    color: String,
    private val year: Int,
    private val manufacturerDiscount: Boolean
) : Car(speed, regularPrice, color) {
    override fun getSalePrice(): Double {
        if (manufacturerDiscount)
            return regularPrice * 0.8
        else
            return regularPrice
    }

    override fun toString(): String {
        return "Ford: speed=$speed, regularPrice=$regularPrice, color=$color, year=$year, manufacturerDiscount=$manufacturerDiscount"
    }
}