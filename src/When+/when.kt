package `When+`

import enumerador.Moneda

/**
 * Created by jeobal on 27/05/2017.
 */

fun convertirANuevosSoles(monto : Double, moneda: Moneda) = when(moneda){
    Moneda.ARS -> monto * 3.4
    Moneda.PEN -> monto
    Moneda.BOB -> monto * 3.42
    Moneda.CLP -> monto * 32.4
    Moneda.COP -> monto * 333.4
    Moneda.MDO -> monto * 1113.4
    Moneda.PYG -> monto * 3323.4
    Moneda.USD -> monto * 23.4
    Moneda.UYU -> monto * 3334.4
}

fun obtenerRegion (moneda: Moneda) = when (moneda){
    Moneda.USD,  Moneda.MDO -> "Norteamerica"
    Moneda.PEN , Moneda.BOB, Moneda.CLP , Moneda.COP,
    Moneda.PYG , Moneda.USD,
    Moneda.ARS -> "Sudamerica"
    else -> false
}

fun main (args:Array<String>){
    println(convertirANuevosSoles(500.9, Moneda.PYG))
    println(obtenerRegion(Moneda.USD))
}
