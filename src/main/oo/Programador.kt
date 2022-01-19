package oo

import enumerados.Lenguajes

class Programador(nombre:String, apellido:String, dni:String, edad:Int=18, val experiencia:Int):Persona(nombre,apellido,dni,edad), IHabilidad {

    val lenguajePrincipal: Lenguajes
    init {
        lenguajePrincipal = Lenguajes.JAVA
    }


    //constructor sobrecargado
    constructor(nombre: String, apellido: String, dni: String):this(nombre,apellido,dni,20,1)

    override fun test(a:Algoritmo) {
        println("test programas")
        println("Probando el algoritmo del autor: ${a.autor}")
    }

    override fun testSomeAlg(vararg a: Algoritmo) {
            a.forEach { println(it.autor) }
            println()

    }

    override fun disenyar() {
        println("Diseñar programas")
    }

    override fun programar() {
        println("codificar programas")
    }

}