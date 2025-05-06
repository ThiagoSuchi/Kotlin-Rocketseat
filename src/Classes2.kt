// Buscas e atribuições personalizadas
class Person2(
    val name: String
) {
    var age: Int = 0
        set(value) { // Atribuindo nova funcionalidade dentro do set
            if (value >= 0) field = value // field é o campo real onde o valor é armazenado dentro de uma propriedade.
            else println("Idade não pode ser negativo.")
        }
    // OBS: só é possível ultilizar o field dentro de set e get.

    var height: Double = 0.0
        get() = Math.ceil(field)
    // Math.ceil() - é uma função que arredonda um número pra cima para o inteiro mais próximo.
}

fun main() {
    val joao = Person2("João")

    joao.age = -28
    joao.height = 180.9

    println(joao.age)
    println(joao.height)
}