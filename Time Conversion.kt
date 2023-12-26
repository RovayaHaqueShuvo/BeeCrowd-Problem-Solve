import java.util.Scanner

fun main(args: Array<String>) {
    var Input = Scanner(System.`in`)
    val seconds = Input.nextInt()

    val hours = seconds/3600
    val mints = (seconds-(hours*3600))/60
    val second = (seconds-(hours*3600)-(mints*60))


    println("$hours : $mints : $second")
}