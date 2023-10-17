import java.util.*

fun main(args: Array<String>) {
    var Scanner = Scanner(System.`in`)

    var A = Scanner.nextInt()
    var B = Scanner.nextInt()
    var C = Scanner.nextInt()
    var D = Scanner.nextInt()

    var DIFERENCA = ((A*B)-(C*D))

    println("DIFERENCA = $DIFERENCA" )

    Scanner.close()

}