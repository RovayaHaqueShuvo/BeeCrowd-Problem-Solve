import java.util.Scanner

fun main(array: Array<String>){

    print("Enter A: ")
    var Input1 = Scanner(System.`in`)
    var A = Input1.nextInt()

    print("Enter B: ")
    var Input2 = Scanner(System.`in`)
    var B = Input2.nextInt()

    var  X:Int = A+B
    println("X = $X")
}