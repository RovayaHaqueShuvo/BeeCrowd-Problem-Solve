import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var number = input.nextFloat()

    when {
        number < 0 || number > 100 -> println("Fora de intervalo")
        number <= 25 -> println("Intervalo [0,25]")
        number <= 50 -> println("Intervalo (25,50]")
        number <= 75 -> println("Intervalo (50,75]")
        else -> println("Intervalo (75,100]")
    }
}