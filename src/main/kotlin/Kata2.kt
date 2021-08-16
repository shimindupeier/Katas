fun main(){
    val arr = null
    println(countPositivesSumNegatives(arr).contentToString())
    println(countPositivesSumNegatives(arr).size)
}

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
//    var outputArr: Array<Int> = Array(2) {0}
//    if (!input.isNullOrEmpty()) {
//        outputArr[0] = input.count { item -> item > 0 }
//        outputArr[1] = input.filter { num -> num < 0 }.sum()
//    } else {outputArr = emptyArray()}

    if (input.isNullOrEmpty()) return emptyArray()
//    val (pos, neg) = input.partition { it > 0 }
    return arrayOf(input.count { item -> item > 0 },input.filter { num -> num < 0 }.sum())
}