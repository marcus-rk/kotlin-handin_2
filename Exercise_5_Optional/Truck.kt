package Exercise_5_Optional

class Truck (
    speed: Double,
    regularPrice: Double,
    color: String,
    private val weight: Double
) : Car(speed, regularPrice, color){

    override fun getSalePrice(): Double {
        if (weight > 2000)
            return (regularPrice * 0.9)
        else
            return (regularPrice * 0.8)
    }

    override fun toString(): String {
        return "Truck: speed=$speed, regularPrice=$regularPrice, color=$color, weight=$weight"
    }

}