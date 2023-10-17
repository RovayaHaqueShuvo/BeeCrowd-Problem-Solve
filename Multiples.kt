import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var A = input.nextInt()
    var B = input.nextInt()

    if(B%A==0){
        println("Sao Multiplos")
    }
    else{
        println("Nao sao Multiplos")
    }
}