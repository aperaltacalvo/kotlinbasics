package enumerados

enum class Lenguajes {
    PYTHON, JAVA, KOTLIN, SCALA;

    fun description():String{
        return when(this){
            PYTHON -> "Lenguaje interpretado"
            JAVA -> "Lenguaje compilado en JVM"
            KOTLIN -> "Lenguaje compilado en ART"
            SCALA -> "Funcional y POO"

        }
    }
}