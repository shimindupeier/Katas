import kotlin.math.abs

fun main() {
    println(Kata().makeNegative1(-1))
    println(Kata().makeNegative2(2))
    println(Kata().makeNegative3(0))
}

class Kata {
    // Before recalling what absolute value is
    fun makeNegative1(x: Int): Int {
        if (x <= 0) return x
        return -abs(x)
    }
    // After recalling what absolute value is
    fun makeNegative2(x: Int) = if (x <= 0) x else -x

    // Final refactoring
    fun makeNegative3(x: Int) = -abs(x)
}

