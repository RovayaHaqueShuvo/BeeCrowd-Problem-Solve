import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the two grades as floating-point values
    val A = scanner.nextDouble()
    val B = scanner.nextDouble()

    // Calculate the weighted average
    val weightedAverage = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5)

    // Print the result with 5 digits after the decimal point
    println("MEDIA = %.5f".format(weightedAverage))

    scanner.close()
}
