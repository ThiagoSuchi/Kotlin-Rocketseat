fun main() {

    var a: String? = null
    val result: String = a ?: "kotlin" // Elvis operator
    println(result)

    var b: Int = -1
    b = a?.toInt() ?: 0
    println(b)

    if (a !== null) {
        println(a!!.toInt())// not null
    }

    val c = a as? Int // Safe cast
    println(c)

    // Método let contra nulos
    println("Método let contra nulos")
    b?.let {// deixar o código mais limpo, evitando if (obj != null) o tempo todo.
        println(it)
    }
}