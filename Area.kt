import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the three floating-point values
    val A = scanner.nextDouble()
    val B = scanner.nextDouble()
    val C = scanner.nextDouble()

    // Calculate and print the areas
    val areaTriangle = (A * C) / 2.0
    val areaCircle = 3.14159 * (C * C)
    val areaTrapezium = ((A + B) * C) / 2.0
    val areaSquare = B * B
    val areaRectangle = A * B

    println("TRIANGULO: %.3f".format(areaTriangle))
    println("CIRCULO: %.3f".format(areaCircle))
    println("TRAPEZIO: %.3f".format(areaTrapezium))
    println("QUADRADO: %.3f".format(areaSquare))
    println("RETANGULO: %.3f".format(areaRectangle))

    scanner.close()
}
