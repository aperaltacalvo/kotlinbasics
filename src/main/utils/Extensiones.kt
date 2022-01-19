package utils

import oo.Programador
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.absoluteValue

fun Date?.customFormat(): String? {
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    if (this != null){
        return formatter.format(this)
    }
    return null
}

fun Programador.finiquitar():Boolean {
    return true
}

fun Int?.sumar(a: Int):Int?{
    this?.plus(a)
    return this
}