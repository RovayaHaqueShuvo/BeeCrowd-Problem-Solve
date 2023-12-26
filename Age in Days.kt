import java.util.Scanner
fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    val inputInDays = input.nextInt()
    val yr = inputInDays/365
    val month = (inputInDays-(yr*365))/30
    val days = (inputInDays-(yr*365)-(month*30))

    println("$yr ano(s)")
    println("$month mes(es)")
    println("$days dia(s)" )
}