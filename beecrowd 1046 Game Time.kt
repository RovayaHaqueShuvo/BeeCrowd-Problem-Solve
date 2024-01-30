import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var start = input.nextInt()
    var end = input.nextInt()
    var sum:Int = 0

    if (start == end){
        println("O JOGO DUROU 24 HORA(S)")
    }
    if (start>end){
        sum = (24-start) + end
        println("O JOGO DUROU ${sum} HORA(S)")
    }
    if (start<end){
        sum= start - end
        println(("O JOGO DUROU ${-sum} HORA(S)"))
    }
}