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