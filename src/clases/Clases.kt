package clases

import GatomanJuarez.Kotlin.persona.Persona

/**
 * Created by GatomanJuarez on 27/05/2017.
 */

/** Se escriben los metodos de acceso por default (lo hace kotlin) */
fun main (args : Array<String>){
    val persona = Persona("Zeus", 19)
    println(persona.nombre)
    println(persona.edad)
    println(persona.mayorEdad)

    persona.edad = 20
    println(persona.edad)
}



