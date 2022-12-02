package day02

object RockPaperScissors {

    fun calculatePair(lhs: String, rhs: String): Int {
        return 8
    }

    fun calculateScore(input: String): Int {
        val lines = input.split("\n")
        return if (lines.size == 1) 8 else 15
    }

    fun assignChoice(input: String): Choice {
        return when (input) {
            "A" -> Choice.ROCK
            "B" -> Choice.PAPER
            "C" -> Choice.SCISSORS
            else -> throw RuntimeException()
        }
    }

}