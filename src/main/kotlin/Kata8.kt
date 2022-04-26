import kotlin.math.abs
import kotlin.test.assertEquals

fun main() {
    assertEquals(
        10, mxdiflg(
            arrayOf("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"),
            arrayOf("bbbaaayddqbbrrrv")
        )
    )
}

fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {

    return if (a1.isEmpty() || a2.isEmpty()) -1
    else {
        val diff = a1.flatMap { a1Ele -> a2.map { a2Ele -> abs(a1Ele.length.minus(a2Ele.length)) } }

        diff.maxOf { it }
    }
}