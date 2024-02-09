package Exercise_1

class Employee (
    private val firstName: String,
    private val lastName: String,
    private var monthlySalary: Double) {

    init {
        this.monthlySalary = if (monthlySalary > 0) monthlySalary else 0.0 // could also throw error
    }

    // Calculate yearly salary based on monthly salary
    fun calculateYearlySalary() : Double {
        return monthlySalary * 12;
    }

    // Apply a raise based on percentage
    fun applyRaiseByPercentage(percentage: Double) {
        this.monthlySalary = monthlySalary * (1 + percentage / 100)
    }

    override fun toString(): String {
        return "[firstName='$firstName', lastName='$lastName', monthlySalary=$monthlySalary]"
    }

}

fun main() {
    val employeeOne: Employee = Employee("John", "Doe", 4000.0)
    val employeeTwo: Employee = Employee("Alice", "Smith", -4000.0) // salary = 0

    println("\nYearly salary before 10% raise:")
    println(employeeOne.toString())
    println("Yearly salary: ${employeeOne.calculateYearlySalary()}")
    println(employeeTwo.toString())
    println("Yearly salary: ${employeeTwo.calculateYearlySalary()}")

    // Apply 10% raise for each employee with giveRaise() method
    employeeOne.applyRaiseByPercentage(10.0)
    employeeTwo.applyRaiseByPercentage(10.0)

    println("\nYearly salary after 10% raise:")
    println(employeeOne.toString())
    println("Yearly salary: ${employeeOne.calculateYearlySalary()}")
    println(employeeTwo.toString())
    println("Yearly salary: ${employeeTwo.calculateYearlySalary()}")
}