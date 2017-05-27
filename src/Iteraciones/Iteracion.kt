package Iteraciones

/**
 * Created by jeobal on 27/05/2017.
 */

fun main (args: Array<String>){
var i = 0
while (i<3){
    println(i)
    i++
}
    do{
        println(i)
        i++
    }while (i < 6)

    //Rango.- valor inicial y valor final
    for (num in 1..10){
        println(num)
    }

    for (e in 1 until 10){
        println(e)
    }

    for (uu in 20 downTo 3){
        println(uu)
    }

    for (ni in 30 downTo  1 step 2){
        println(ni)
    }

    for (ei in 10..34 step 3){
        println(ei)
    }

    val arreglo = arrayListOf("A","B", "C", "D")
    for (w in arreglo){
        println(w)
    }

    for ((index, eo) in arreglo.withIndex()){
        println("$index $eo")
    }
}

