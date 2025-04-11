import java.security.InvalidParameterException

fun main() {
    var x: Int = 1

    x = try {// O try catch pode ser vinculado a uma atribuição de valores
        10 / 0
    } catch (e: ArithmeticException) {
        println("Erro de expressão aritmética")
        3
    } catch (e: Exception) {
        println("Erro genérico")
        5
    }
    println(x)
   // OBS: A ordem de análise dos catchs importam!
}