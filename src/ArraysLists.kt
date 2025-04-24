fun main() {
   // Arrays
    val array: Array<Int> = arrayOf(1,2,3,4,5)
    val array2: Array<String> = arrayOf("1","2","3","4","5")

    println(array.joinToString(prefix = "[", postfix = "]", separator = " | "))
    println(array2.joinToString())

   // Lists
    val list = listOf(1, 2, 3,)
    val list2 = mutableListOf(1, 2, 3, "opa", false, 1..5, 9.8, 10, 23)

    list2.add(4)
    println(list2)

    val listint: List<Int> = list.filterIsInstance<Int>()
    println(listint)

    val listIntHigherThan2 = list2.filter { it is Int && it > 2 }
    println(listIntHigherThan2)

    val listIntMessy = listOf(-2, -22, 10, 3, 5, 30, 33, 20, 8, 6, 7, 17, -301)
    val listStringMessy = listOf("Antônio", "Flávi", "Júlia", "Carol", "Abelardo", "Eduardo")

    // .sorted() - modifica a própria lista organizando na ordem natural dos elementos(ordem crescente para nums, ordem alfabética para strings)
    println(listIntMessy.sorted())
    println(listStringMessy.sorted())

    // .reversed() - inverte a ordem dos elementos
    println(listIntMessy.reversed())
    println(listStringMessy.reversed())

    val intMax = listIntMessy.max()
    val intMin = listIntMessy.min()

    println(intMax)
    println(intMin)

    // .find{} - Procura o primeiro elemento da lista que satisfaça os parâmetros da lista.
    val findFirstOdd = list.find { it is Int && it % 2 != 0 }
    println(findFirstOdd)

    val findLastOdd = list.findLast { it is Int && it % 2 != 0 }
    println(findLastOdd)
}