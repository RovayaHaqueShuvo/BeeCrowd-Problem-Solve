import java.util.Scanner

fun main(args: Array<String>) {
    var Input = Scanner(System.`in`)

    var sum = 0
    var num: Int

    println("Enter numbers to add (enter 0 to stop):")

    while (Input.hasNextInt()) {
         num = Input.nextInt()
        if (num == 0) break  // Exit the loop if 0 is entered
        sum += num
    }

    val hours = sum/3600
    val mints = (sum-(hours*3600))/60
    val second = (sum-(hours*3600)-(mints*60))


    println("HOURS( $hours ) : MINITUS( $mints ) : SECOND( $second )")
}

