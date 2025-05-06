// Funções Infix com função de extenção
infix fun Int.sum(num: Int): Int = this + num

// Funções Infix com Class
class XY(val x: Int, val y: Int) {
    infix fun sum(xy: XY): XY {
        return XY(x = this.x + xy.x, y = this.y + xy.y)
    }
}

fun main() {

    println(1 sum 2)

    val xy = XY(x = 10, y = 2) sum XY(x = 27, y = 19)
    println(xy.x)
    println(xy.y)

}

// O que é uma função infix?
// É uma função de instância (método) com as seguintes características:
// - Deve ser member ou extension function (função dentro de uma classe ou extensão de um tipo).
// - Deve ter exatamente um parâmetro.
// - Deve ser marcada com a palavra-chave infix.
// em Kotlin são uma forma especial de declarar métodos que podem ser chamados como operadores, ou seja, sem ponto nem parênteses