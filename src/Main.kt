fun main() {
    println("Diga seu nome: ")
    val name = readln()// Solicita para o usuário uma inserção via terminal, e nos entrega um valor tipo String
    println("Hello, $name!")

    println("Diga sua idade: ")
    val age = readln().toInt()

    for (i in 1..age) {
        val ageText = if (i == age) "A sua idade é $i!" else "$i..."
        println(ageText)
    }
}