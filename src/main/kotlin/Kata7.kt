import kotlin.math.pow

fun main() {
    println(revRot("73304991087281576455176044327690580265896896028", 8))
}

fun revRot(nums: String, sz: Int): String {
    // return empty string if string length is less than sz or empty
    if (sz <= 0 || sz > nums.length) return ""

    // The code below doesn't work with Codewars. Here we use kotlin 1.5 while codewars supports only 1.3
    return nums.chunked(sz).filter { i -> i.length == sz }.joinToString("") { i ->
        if ((i.sumOf { it.digitToInt().toDouble().pow(3.0)}) % 2.0 == 0.0) {
            i.reversed()
        } else {
            i.drop(1) + i.take(1)
        }
    }

    /* This is the code based on Kotlin verion 1.3 */
//    return nums.chunked(sz).filter { i -> i.length == sz }.toList()
//        .map { i -> i.map(Character::getNumericValue) }.joinToString("") { i ->
//        if ((i.sumByDouble { it.toDouble().pow(3.0) }) % 2.0 == 0.0) i.reversed().joinToString("")
//        else {
//            (i.drop(1) + i.take(1)).joinToString("")
//        }
//    }
}