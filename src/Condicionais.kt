fun main() {
    // when
    val x = 10
    val y = 100
    val z = 189

    val result = when (z) {
        in 1 ..< 100 -> "1..99"
        100 -> "100"
        in 101..200 -> "101..200"
        else -> "else"
    }

    println(result)
}