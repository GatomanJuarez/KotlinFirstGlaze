package enumerador

/**
 * Created by jeobal on 27/05/2017.
 */

/** Enumerador coleccion de constantes */
enum class Moneda(val simbolo : String){
    USD("$"), PEN("S/."), ARS("$"), MDO("$"), BOB("\$b"), CLP("$"), COP("$"), PYG("Gs"), UYU("\$U");

    fun formato(monto : Double) = "$simbolo $monto"
}

fun main(args : Array<String>){
    println(Moneda.ARS)
    println(Moneda.BOB.simbolo)
    println(Moneda.ARS.formato(5.2))
}
