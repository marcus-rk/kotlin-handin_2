package Exercise_4

import kotlin.math.PI
import kotlin.math.pow

class Circle(
    color: String,
    isTransparent: Boolean,
    private val radius: Double
) : Shape(color, isTransparent) {

    // NOTE: Perimeter of an circle is circumference
    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }

    override fun calculateArea(): Double {
        return PI * radius.pow(2)
    }

    override fun toString(): String {
        return "Circle[radius=$radius]"
    }

}