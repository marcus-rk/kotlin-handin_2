package Exercise_4

import kotlin.math.sqrt

class Triangle(
    color: String,
    isTransparent: Boolean,
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) : Shape(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    // Found a formula here for Heron's formula: https://www.mathsisfun.com/geometry/herons-formula.html
    override fun calculateArea(): Double {
        // Calculating half of the triangles perimeter
        val s: Double = calculatePerimeter() / 2

        // Calculating area with Heron's formula: A = √s(s−a)(s−b)(s−c)
        val insideOfSquare: Double = s * (s - sideA) * (s - sideB) * (s - sideC)
        return sqrt(insideOfSquare)
    }

    override fun toString(): String {
        return "Triangle[sideA=$sideA, sideB=$sideB, sideC=$sideC]"
    }

}