/*import java.util.*

fun main(array: Array<String>) {
    val scanner = Scanner(System.`in`)

    val Number = scanner.nextDouble()
    val WorkHour = scanner.nextDouble()
    var ReciveAmount = scanner.nextFloat()

    // Calculate the weighted average
    val Salary = WorkHour*ReciveAmount

    println("Number = $Number")
    println("Salary = U$ %.2f".format(Salary))

    scanner.close()
}
*/

import java.util.*

fun main(array: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Read employee's number, worked hours, and hourly rate
    val employeeNumber = scanner.nextInt()
    val workedHours = scanner.nextInt()
    val hourlyRate = scanner.nextDouble()

    // Calculate the monthly salary
    val salary = workedHours * hourlyRate

    // Print the result with two decimal places
    println("NUMBER = $employeeNumber")
    println("SALARY = U$ %.2f".format(salary))

    scanner.close()
}

