import java.util.*

fun main(array: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Read the two grades as floating-point values
    val A = scanner.nextDouble()
    val B = scanner.nextDouble()
    var C = scanner.nextDouble()

    // Calculate the weighted average
    val weightedAverage = ((A * 2) + (B * 3)+(C *5)) / (2+3+5)

    // Print the result with 5 digits after the decimal point
    println("MEDIA = %.1f".format(weightedAverage))

    scanner.close()
}
