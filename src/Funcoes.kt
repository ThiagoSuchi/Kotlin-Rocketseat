// Funções básicas
fun isEven(num: Int) {
    println("$num é par? ${num % 2 == 0}")
}

// Função de Ordem Superior
fun sum(a: Int, b: Int): Int = a + b

fun subtract(a: Int, b: Int): Int = a - b

fun multiply(a: Int, b: Int): Int = a * b

fun mathOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {// Recebe outra função como parâmetro
    return operation(a, b)
}

fun main() {
    val num = 4
    isEven(num)

    // Funções anônimas
    val funSum = { a: Int, b: Int -> a + b }// Lambda - é uma forma curta de declarar uma função anônima
    println(funSum(1, 2))

    // funções de Ordem superior com lambda (função anônima)
    val divide = { a: Int, b: Int -> a / b }

    println(mathOperation(4, 2, divide))
    println(mathOperation(5, 10, ::sum))
    println(mathOperation(200, 10, ::subtract))
    println(mathOperation(5, 10, ::multiply))

    // Quando usar :: (operador de referência de função):
    // Use :: quando estiver passando uma função nomeada (declarada com fun) como argumento, ou seja,
    // quando você quiser referenciar a função sem executá-la.
    // Por quê?
    // Porque funções nomeadas não são valores por padrão — para passá-las como argumento,
    // você precisa converter a função em um valor funcional usando ::.

    // Quando não usar :::
    // Não use :: quando estiver passando uma lambda armazenada em uma variável,
    // pois ela já é um valor de função.
    // Por quê?
    // Porque lambdas atribuídas a variáveis já são objetos do tipo função,
    // prontos para serem usados diretamente.
}

