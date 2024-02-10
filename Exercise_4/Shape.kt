package Exercise_4

abstract class Shape (
    private val color: String,
    private var isTransparent: Boolean
) {
    // Abstract method to calculate perimeter of the shape
    abstract fun calculatePerimeter() : Double

    // Abstract method to calculate area of the shape
    abstract fun calculateArea() : Double
}