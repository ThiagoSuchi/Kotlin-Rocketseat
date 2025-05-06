// Função de extensão
fun String.isPalindromo(): Boolean {
    return this == this.reversed()
}

fun Double.format(decimalDigits: Int): String {
    return "%.${decimalDigits}f".format(this)
}

fun main() {
    // Funções de extensões
    println("radar".isPalindromo())
    println("banana".isPalindromo())

    println(3.45.format(1))
}

/*
    Funções de extensão em Kotlin permitem adicionar comportamentos a classes já existentes
    (como String, Double, Int etc.) sem precisar modificá-las ou criar subclasses.

    No exemplo abaixo, criamos duas funções de extensão:

    1. String.isPalindromo():
       - Adiciona à classe String a capacidade de verificar se a palavra é um palíndromo
         (ou seja, se ela é igual quando lida de trás para frente).
       - Exemplo: "radar".isPalindromo() retorna true.

    2. Double.format(decimalDigits: Int):
       - Adiciona à classe Double a capacidade de formatar um número com uma quantidade
         específica de casas decimais, retornando como String.
       - Exemplo: 3.1415.format(2) retorna "3.14".

    Essas funções tornam o código mais expressivo e legível, como se esses comportamentos
    já fizessem parte das classes originais.
*/
