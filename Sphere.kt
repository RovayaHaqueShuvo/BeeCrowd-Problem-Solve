import java.util.Scanner

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    val pi = 3.14159
    var R = scanner.nextDouble()

    var Volume = (4.0/3.0)*pi * (R*R*R)

    println("VOLUME = %.3f".format(Volume))

}