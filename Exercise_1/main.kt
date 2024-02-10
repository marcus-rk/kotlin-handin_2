package Exercise_1

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