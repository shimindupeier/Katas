fun main() {
    val mixList = listOf(9, 3, "7", "3")
    println(MixedSum().sum(mixList))
}

public class MixedSum {

    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {
        val mixListInt: List<Int> = mixed.map { i ->
            when (i) {
                is String -> i.toInt()
                else -> {
                    i as Int
                }
            }
        }
        return mixListInt.sumOf { it }
    }
}