package Exercise_4

class Rectangle(
    color: String,
    isTransparent: Boolean,
    private val height: Double,
    private val width: Double
) : Shape(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return calculateArea() * 2
    }

    override fun calculateArea(): Double {
        return height * width
    }

    override fun toString(): String {
        return "Rectangle[height=$height, width=$width]"
    }

}