import kotlin.random.Random

// Criando classes
class Person(val name: String = "Desconhecido", val age: Int = 0) {

    private val password: String = name + Random.nextInt(100)

    private fun usePassword() {
        println(password)
    }

    fun work(): String {
        usePassword()
        return "$name tem $age anos de idade e está trabalhando."
    }
}

class Work(val name: String, val function: String) {
    fun getWork(): String {
        return "Trabalha na empresa $name, como $function."
    }
}

fun main() {
    val leticia: Person = Person("Letícia", 32)
    val marta: Person = Person("Marta")
    val work: Work = Work("Tigrão - Materiais para construção", "vendedora")

    println(leticia.work())
    println(marta.work())
    println(work.getWork())
}