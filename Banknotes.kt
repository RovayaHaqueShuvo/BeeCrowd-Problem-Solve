import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    val Notes= input.nextInt()

    val Hundred = Notes/100
    val fifty = (Notes-(Hundred*100))/50
    val twinty = (Notes-(Hundred*100)-(fifty*50)) /20
   val ten = (Notes-(Hundred*100)-(fifty*50)-(twinty*20))/10
    val five = (Notes-(Hundred*100)-(fifty*50)-(twinty*20)-(ten*10))/5
    val two = (Notes-(Hundred*100)-(fifty*50)-(twinty*20)-(ten*10)-(fifty*5))/2
    val One =(Notes-(Hundred*100)-(fifty*50)-(twinty*20)-(ten*10)-(fifty*5)-(two*2))/1


   println(Notes)
    println("$Hundred nota(s) de R$ 100,00")
    println("$fifty nota(s) de R$ 50,00")
    println("$twinty nota(s) de R$ 20,00")
    println("$ten nota(s) de R$ 10,00")
    println("$five nota(s) de R$ 5,00")
    println("$two nota(s) de R$ 2,00")
    println("$One nota(s) de R$ 1,00")

}