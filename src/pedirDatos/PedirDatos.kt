package pedirDatos

import java.util.*

/**
 * Created by GatomanJuarez on 27/05/2017.
 */

fun main (args: Array<String>){
    println("¿Como te llamas?")
    val scanner = Scanner(System.`in`)
    val nextLine = scanner.nextLine()
    val name = if(nextLine != "") nextLine else "Kotlin"

    println("Hola $name")
    println("Hola ${if(nextLine != "") nextLine else "Kotlin"}")
}