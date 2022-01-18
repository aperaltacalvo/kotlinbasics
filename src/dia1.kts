import kotlin.reflect.KProperty0

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
main()

fun main() {
    val edad: Int = 78
    println("Hello, world!!!")
    println(procesar())
    println(procesarV2("pepito"))
    condicional(2)

    //Pattern Matching
    val comentario = when(edad){
        78 -> {val res = "pepe"
            res}
        else -> "Aprendiz"
    }
    println("Resultado when: $comentario")
    val resultado = if (true) "Hola" else "adios"
    println(resultado)

    //Manejo de listas
    val profesores:MutableList<String> = mutableListOf()


    anyadirProfe("Ricky", profesores)
    for (p in profesores){
        println(p)
    }
    //Funciones y bucles
    println(sumar(1.0,2.0))
    var i = 0
    while (i < 5){
        println(i)
        i++
    }


    //Rangos en bucles

    for (e in 0..3){
        println(e)
    }
    for (e in 0 until 3){
        println(e)
    }
    for (e in 5 downTo 2){
        println(e)
    }


    //Rangos
    range(4)
    range(11)

    //Elvis operator
    val datax:Int? = null
    val resultado2= datax?:2
    println(resultado2)

    //Funciones anonimas
    val mayusconversion: (String) -> String = {str:String -> str.toUpperCase()}
    val convertirmayus: (String) -> String = {it.toUpperCase()}


    println(mayusconversion("patata"))
    println(convertirmayus("patata"))


    // functional programming
    val convertirAMinusculas = { str:String -> convertirMinusculas(str)}
    println(convertirAMinusculas("pepe"))
    val restar = {x:Int, y:Int -> x-y}

    println(calcular(1,2, restar))
    println(calcular(1,2, ::sumar))
    var numeros:MutableList<Int> = arrayListOf()
    numeros.add(1)
    numeros.add(2)
    numeros.add(3)
    numeros.add(4)
    verNumeros(numeros)
    val resultadoCalculo = calcular(10,5) {x,y -> x*y}
    println(resultadoCalculo)



    //conjuntos inmutables
    val conjuntoInmutable: Set<Double> = setOf(2.0,5.0,4.0,2.0)
    val conjuntoMutable: MutableSet<Double> = mutableSetOf(2.0,5.0,4.0,2.0)
    listarValores(conjuntoInmutable)
    listarValores(conjuntoMutable)


    //mapas
    val pair:Pair<String,Double> = Pair("pepe",34.0)
    val mapMut: MutableMap<String,Double> = mutableMapOf(pair)
    listarValoresMap(mapMut)
    val (a,b) = pair
    val (x,y,z) = listOf(1,2,3,4)

    println("a: $a and b: $b")
    println("x:$x, y:$y, z:$z")

    val items = (0..100).toList()


    //filter
    val itemsUpper51andlower70 = items.filter { item -> item in 51..69 }
    val itemsUpper50 = items.filter { item -> item > 50&& item<70 }

    itemsUpper50.forEach{println(it)}
    itemsUpper51andlower70.forEach{println(it)}

    //map
    val items_mult_5 = items.filter {it > 50}.map { it*5 }
    items_mult_5.forEach{println(it)}
    tratarData("Kotlin")
    tratarData(null)
}

fun tratarData(str:String?){
    str?.let{
        println(it.toUpperCase())
    } ?: println("es nulo")
}

fun verNumeros(nums:List<Int>){
    nums.forEach { x -> println(x) }
}
fun listarValores(nums: Set<Double>){
    nums.forEach { x -> println(x) }
}
fun listarValoresMap(m: Map<String,Double>){
    for((k,v) in m){
        println("Valor: $k $v")
    }
}
fun convertirMinusculas(str: String):String = str.toLowerCase()

fun sumar (x:Int, y:Int):Int{
    return x+y
}

fun calcular(x:Int, y:Int, operation: (Int, Int) -> Int): Int {
    return operation(x,y)
}

fun range(valor:Any){
    when(valor){
        !in 2..10 -> println("out of range")
        else -> println("pepito")
    }
}
fun condicional(valor: Any){
    when(valor) {
        1 -> println("Uno")
        "Hola" -> println("Saludo")
        is Long -> println("Long")
        !is String -> println("not String")
        else -> println("Otros")
    }

}


fun anyadirProfe(nombre:String, profesores:MutableList<String>){
    profesores.add(nombre)
}
fun procesar(): String{
    return "Hola Kotlin"
}

fun procesarV2(saludo: String) = "$saludo Kotling otra vez"

fun sumar( a:Double, b:Double):Double{
    return a + b
}


