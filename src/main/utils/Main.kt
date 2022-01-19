package utils

import oo.Algoritmo
import oo.Persona
import oo.Programador


fun main(){
    val pepe = Persona("pepe","perez", "404040404A",18)

    println("aqui va")
    println(pepe.nombre)
    pepe.nombre = "juan"
    println(pepe.nombre)

    val JuanJefe = Persona("Juan", "Gomez", "11G", 67)
    val mariaProgramadora = Programador("Maria", "Larios", "22G", 23, 5)

    val algML = Algoritmo("R.Lester", 2018, listOf("Regresion","Clasificacion"))
    val algMLAI = algML.copy(autor="B. Norton")
    mariaProgramadora.test(algML)
    mariaProgramadora.test(algMLAI)
    mariaProgramadora.testSomeAlg(algML, algMLAI)
    println(mariaProgramadora.finiquitar())

    val mariaExperiencia=mariaProgramadora.experiencia.sumar(1)

    println("Anyos experiencia Maria ${mariaExperiencia}")

}






