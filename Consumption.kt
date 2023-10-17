import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    // Read the total distance (in Km) and the total fuel spent (in liters)
    val distance = scanner.nextInt()
    val fuelSpent = scanner.nextDouble()

    // Calculate the average consumption
    val averageConsumption = distance / fuelSpent

    // Print the result with 3 digits after the decimal point
    println("%.3f km/l".format(averageConsumption))

    scanner.close()
}
