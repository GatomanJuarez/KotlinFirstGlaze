package SmartCast

/**
 * Created by jeobal on 27/05/2017.
 */

//3*4*2+2+4
interface Expresion
class Numero(val valor: Int) : Expresion
class Sumar(val valorA : Expresion, val valorB : Expresion) : Expresion
class Multiplicar(val valorA : Expresion, val valorB : Expresion) : Expresion

fun evaluarExpresion (expresion: Expresion) : Int = when (expresion) {
    is Numero -> expresion.valor
    is Sumar -> evaluarExpresion(expresion.valorA) + evaluarExpresion(expresion.valorB)
    is Multiplicar -> evaluarExpresion(expresion.valorA) * evaluarExpresion(expresion.valorA)
    else ->
        throw IllegalArgumentException("No se puede reconocer")
}
    //intanceOf = is
    //Al compararlo Kotlin sabe que eso es de este tipo.


fun main (args : Array<String>){
    println(evaluarExpresion(Sumar(Sumar(Multiplicar(Multiplicar(Numero(3), Numero(4)), Numero(2)), Numero(2)), Numero(4))))
}