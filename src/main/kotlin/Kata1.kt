fun main() {
    val n: Int = 10
    val d: Int = 0
    val hmap = hashMapOf(
        '0' to 0,
        '1' to 1,
        '2' to 2,
        '3' to 3,
        '4' to 4,
        '5' to 5,
        '6' to 6,
        '7' to 7,
        '8' to 8,
        '9' to 9
    )

    val squaresList: List<String> = (0..n).map { i -> (i * i).toString() }
    val numberOfOnes: List<Int> = squaresList.map { str ->
        str.filter { c -> hmap.getOrDefault(c, 0) == d }.length
    }
    println("123".length)

    println(squaresList)
    println(numberOfOnes)
    val sum = numberOfOnes.sum()
    println(sum)
}