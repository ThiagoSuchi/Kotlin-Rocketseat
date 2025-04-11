import kotlin.properties.Delegates

fun main() {
    // Lateinit
    // Não pode usar com:
    // - val (só funciona com var);
    // - Tipos primitivos (Int, Double, Boolean, etc.).
    lateinit var a: String// Aqui o lateinit diz que a variável será inicializada depois, e que garante que não será nula.

    // ...

    a = "Opa bão?"
    println(a)

// -------------------------------------------------------------------------------

    // Lazy
    // - lazy só funciona com val.
    // - só será inicializada quando for usada pela primeira vez, e a função dentro do lazy {} só é chamada uma vez.
    val b: String by lazy {
        println("carregando...")// -> Função(bloco lazy) que será executada apenas uma vez.
        "Kotlin lazy"
    }
    println(b)
    println(b)

// -------------------------------------------------------------------------------

    // Delegates
    // - pode ser usada com tipos primitivos
    // - declara uma variável que srá usada depois
    // - obrigatóriamente ser inicializada antes de ser usada
    var c by Delegates.notNull<Int>()// não pode ser nula
    c = 10
    println(c)
}