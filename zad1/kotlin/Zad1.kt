fun main(args: Array<String>) {
    val input : CharArray = args[0].toCharArray()

    val sum1 = solveCaptcha(input, 1)
    val sum2 = solveCaptcha(input, input.size / 2)
    println("Part 1: $sum1")
    println("Part 2: $sum2")
}

fun solveCaptcha(input: CharArray, distance: Int): Int {
    var sum = 0

    for (index in input.indices) {
        val first = input[index]
        val second = input[(index + distance) % input.size]
        if (first == second) {
            sum += first.toInt() - 48
        }
    }

    return sum
}