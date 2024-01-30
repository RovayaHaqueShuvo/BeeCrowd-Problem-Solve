import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    val whichOne = input.nextInt()
    val quantity = input.nextFloat()
    val price = arrayOf(4.00, 4.50, 5.00, 2.00, 1.50)
    when (whichOne) {
        1 -> println("Total: R$ ${String.format("%.2f", price[0] * quantity)}")
        2 -> println("Total: R$ ${String.format("%.2f", price[1] * quantity)}")
        3 -> println("Total: R$ ${String.format("%.2f", price[2] * quantity)}")
        4 -> println("Total: R$ ${String.format("%.2f", price[3] * quantity)}")
        5 -> println("Total: R$ ${String.format("%.2f", price[4] * quantity)}")
    }
}
