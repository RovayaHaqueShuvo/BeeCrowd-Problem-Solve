import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var A =input.nextInt()
    var B =input.nextInt()
    var C =input.nextInt()
    var D =input.nextInt()
    if (B>C && D>A && (C+D)>(A+B) && C >=0 && D>= 0 && A%2== 0){

        println("Valores aceitos")

    }else
        println("Valores nao aceitos")
}