package Exercise_4

fun main() {
    // Create instances of Circle, Rectangle and Triangle
    val circle: Circle = Circle("White", isTransparent = true, 12.25)
    val rectangle: Rectangle = Rectangle("Black", isTransparent = false, 10.5, 5.2)
    val triangle: Triangle = Triangle("Red", isTransparent = true, 10.0,4.5, 8.0)

    // Store the instances in a list (Possible because of polymorphism -> all Shape)
    val shapes: List<Shape> = listOf(circle, rectangle, triangle)

    // Display objects and calculatePerimeter() calculateArea() polymorphism override
    for (shape in shapes) {
        println(shape.toString())
        println(shape.calculatePerimeter())
        println(shape.calculateArea())
        println()
    }

}