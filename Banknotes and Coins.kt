
import java.util.Scanner
import kotlin.math.roundToInt


fun main(args: Array<String>) {
    var a: Float
    var N: Int
    var b: Float
    var m: Int
    var input =Scanner(System.`in`)
    a = input.nextFloat()

    N = a.toInt()
    b = a - N
    println("NOTAS:")
    println("${N / 100} nota(s) de R$ 100.00")
    N %= 100
    println("${N / 50} nota(s) de R$ 50.00")
    N %= 50
    println("${N / 20} nota(s) de R$ 20.00")
    N %= 20
    println("${N / 10} nota(s) de R$ 10.00")
    N %= 10
    println("${N / 5} nota(s) de R$ 5.00")
    N %= 5
    println("${N / 2} nota(s) de R$ 2.00")
    N %= 2
    println("MOEDAS:")
    println("$N moeda(s) de R$ 1.00")
    m = (b * 100).roundToInt()
    println("${m / 50} moeda(s) de R$ 0.50")
    m %= 50
    println("${m / 25} moeda(s) de R$ 0.25")
    m %= 25
    println("${m / 10} moeda(s) de R$ 0.10")
    m %= 10
    println("${m / 5} moeda(s) de R$ 0.05")
    m %= 5
    println("${m / 1} moeda(s) de R$ 0.01")
}

