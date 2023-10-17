import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the number of friends
    val n = scanner.nextInt()
    scanner.nextLine() // Consume the newline

    for (i in 1..n) {
        val birthday = scanner.nextLine()
        val sign = findZodiacSign(birthday)
        println(sign)
    }

    scanner.close()
}

fun findZodiacSign(birthday: String): String {
    val parts = birthday.split("/")
    val day = parts[0].toInt()
    val month = parts[1].toInt()

    when (month) {
        1 -> return if (day <= 20) "capricornio" else "aquario"
        2 -> return if (day <= 19) "aquario" else "peixes"
        3 -> return if (day <= 20) "peixes" else "aries"
        4 -> return if (day <= 20) "aries" else "touro"
        5 -> return if (day <= 20) "touro" else "gemeos"
        6 -> return if (day <= 20) "gemeos" else "cancer"
        7 -> return if (day <= 21) "cancer" else "leao"
        8 -> return if (day <= 22) "leao" else "virgem"
        9 -> return if (day <= 22) "virgem" else "libra"
        10 -> return if (day <= 22) "libra" else "escorpiao"
        11 -> return if (day <= 21) "escorpiao" else "sagitario"
        else -> return "capricornio"
    }
}
