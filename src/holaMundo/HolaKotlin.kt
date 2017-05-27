package holaMundo

/**
 * Created by GatomanJuarez 27/05/2017.
 */
fun main(args: Array<String>){
    println("Hola mundo de Kotlin")

    println(sumar(4,5))
    println(mayorEdad(17))
    println(mayorEdad(18))

}

/** Metodo que retorna valores.
 * fun nombre_metodo (nombre_variable : tipo) : tipo que retorna
 */
fun sumar(a : Int, b : Int) : Int{
    return a + b
}

/** O tmabie podems hacerlo asi
 * fun holaMundo.sumar (a : Int, b : Int) = a + b
 */

fun mayorEdad(edad : Int) = if (edad >= 18) true else false

