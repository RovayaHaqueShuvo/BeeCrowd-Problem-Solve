/*import java.util.*

fun main(array: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Read employee's number, worked hours, and hourly rate
    val employeeName:String = scanner.next()
    val FixedSalry = scanner.nextFloat()
    val Bonus = scanner.nextFloat()*(.15)

    // Calculate the monthly salary
    val salary = FixedSalry +Bonus

    // Print the result with two decimal places
    println("Total = R$ %.2f".format(salary))

    scanner.close()
}
*/


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Read seller's name, fixed salary, and total sales
    val sellerName = scanner.next()
    val fixedSalary = scanner.nextDouble()
    val totalSales = scanner.nextDouble()

    // Calculate the final salary with a 15% commission on total sales
    val finalSalary = fixedSalary + (totalSales * 0.15)

    // Print the result with two decimal places
    println("TOTAL = R$ %.2f".format(finalSalary))

    scanner.close()
}
