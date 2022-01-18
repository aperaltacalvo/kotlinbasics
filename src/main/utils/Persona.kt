package utils

class Persona(nombre:String, apellido:String, dni:String, edad:Int=18) {

    private val nombre:String
    private val apellido:String
    private val dni:String
    private val edad:Int


    init {
        this.nombre = nombre
        this.apellido = apellido
        this.dni = dni
        this.edad = edad
    }

    fun getName():String{
        return this.nombre
    }
}