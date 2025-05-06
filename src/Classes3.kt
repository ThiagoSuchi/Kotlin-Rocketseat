class Person3 {

    companion object { // Bloco dentro da classe que permite criar membros sem precisar instanciar
        const val KEY = "12345678"
        private val KEY_2 = "1234567890"

        fun getKey() : String {
            return KEY + KEY_2
        }
    }
    // Serve pra quê? Criar funções utilitárias, fábricas de objetos, constantes, etc.

}

fun main() {
    val key = Person3.KEY
    val obtainKey = Person3.getKey()

}