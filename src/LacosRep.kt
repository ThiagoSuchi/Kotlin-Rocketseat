// Laços de repetições

fun main() {

    println("-----------------For------------------")
    // For
    val list = listOf("aaf", false, 3.9, 4f, 5)
    for (item in list) {
        println(item)
    }

    println("---------------ForEach--------------------")
    // ForEach
    list.forEach { item ->
        println(item)
    }

    println("-----------------ForEachIndexed------------------")
    // ForEachIndexed
    list.forEachIndexed { index, item ->
        println("index - $index | item - $item")
    }

    println("-----------------Capturando o index com o for------------------")
    // Capturando o index com for
    for ((index, item) in list.withIndex()) {
        println("index - $index | item - $item")
    }

    println("-----------------While------------------")
    // While
    var index = 1
    val maxLimit = 5
    while (index <= maxLimit) {
        println("$index...")
        index++
    }

    println("-----------------Do / While------------------")
    // Do / While
    var index2 = 1
    do {
        println(index2)
        index2++
    } while (index2 <= 5)

    println("-----------------Laços Aninhados------------------")
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                break@loop
            }
            println("i = $i | j = $j")
        }
    }

    println("-----------------Repeat------------------")
    // Repeat
    var index3 = 1
    repeat(10) {
        println(index3)
        index3++
    }
}