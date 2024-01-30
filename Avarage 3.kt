import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Read the four scores
    val n1 = scanner.nextDouble()
    val n2 = scanner.nextDouble()
    val n3 = scanner.nextDouble()
    val n4 = scanner.nextDouble()

    // Calculate the weighted average
    val weightedAverage = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10

    // Print the initial average
    println("Media: ${String.format("%.1f", weightedAverage)}")

    if (weightedAverage >= 7.0) {
        println("Aluno aprovado.")
    } else if (weightedAverage < 5.0) {
        println("Aluno reprovado.")
    } else {
        println("Aluno em exame.")

        // Read the exam score
        val examScore = scanner.nextDouble()
        println("Nota do exame: ${String.format("%.1f", examScore)}")

        // Recalculate the average with exam
        val finalAverage = (weightedAverage + examScore) / 2

        // Print the final result
        if (finalAverage >= 5.0) {
            println("Aluno aprovado.")
        } else {
            println("Aluno reprovado.")
        }

        println("Media final: ${String.format("%.1f", finalAverage)}")
    }
}
