fun main() {
    val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
    println(duplicateCount("abcdefghijklmnopqrstuvwxyzbaaAAB"))
}

fun duplicateCount(text: String) = text
    .toList()
    .groupBy { it.lowercaseChar()}
    .filter { i: Map.Entry<Char, List<Char>> -> i.value.size > 1 }.count()
