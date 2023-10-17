import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Read three integer values
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    // Find the greatest value
    val greatest = maxOf(a, b, c)

    // Print the result
    println("$greatest eh o maior")

    scanner.close()
}
