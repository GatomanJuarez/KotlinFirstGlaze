/**
 * Created by jeobal on 27/05/2017.
 */

package GatomanJuarez.Kotlin.persona

class Persona(val nombre : String, var edad : Int){
    val mayorEdad : Boolean
        get(){
            return if(edad >= 18)true else false
        }
}