fun main() {
    // setOf - è imutávl, e garante que as coleções não irão ter elementos duplicados
    val set = setOf(1, 2, 3, 2)
    println(set)

    val setRandos = setOf(1, 2, 3, "maça", "casa", 1..10, 4.0, 5f, 4.0, "maça", "predio")
    println(setRandos)

    // A diferença do setOf para mutableSetOf é que ele é mutável, ou seja,
    // é possível adicionar, alterar e remover a coleção ja criada.
    val setMutable = mutableSetOf(1, 2, 3, 3, "ola", "java", "ola", 1)
    setMutable.add(22)
    println(setMutable)

    // hashSetOf - è mais eficiente e rápido,
    // não garante a mesma ordem dos elementos,
    // é mutável, armazena elemento único
    val hashSet = hashSetOf(1, 2, 3)
    println(hashSet)

    // mapOf - é usada para criar um mapa imutável (ou seja, que não pode ser alterado depois de criado).
    // Um mapa (ou dicionário) é uma coleção que armazena pares de chave e valor (key -> value)
    // e não aceita chaves duplicadas.
    val map = mapOf<Int, String>(
        Pair(1, "typescript"),
        Pair(2, "java"),
        3 to "typescript",
        4 to "javascript"
    )
    println(map)

    println(map.size)// tamanho
    println(map.keys)// chaves
    println(map.values)// valores
    println(map.entries)// chaves e valores

    // Aqui a coleção criada pode ser modificada(mutável).
    val mutableMap = mutableMapOf(
        1 to "kotlin",
        "kotlin" to 1,
        1f to 1.9,
        100..200 to 1
    )
    println(mutableMap)

    // hashMap Of - è mais eficiente e rápido,
    // não garante a mesma ordem dos elementos,
    // é mutável, armazena elemento único
    val hashMap = hashMapOf(2 to "joão")
    println(hashMap)

    // OBS: Ambas são formas de criar um par de chave-valor. Kotlin permite duas formas:
    // Forma 1 - Pair(a, b)
    // Forma 2 - a to b ← mais comum e mais legível
}