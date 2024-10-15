/**
 * REFERENCIAS
 *      play.kotlinlang.org
 *      https://youtube.com/playlist?list=PLU8oAlHdN5BkdfBPpNv_lVCJxJgE87cr0&si=_ABy8_Jo8ZsWlyFN
 */

 fun main() {

	// FORMA 01
    // Es obligatorio pone un valor a todas (5) las posiciones {0}
    val miArray=Array(5){0} 
    println("miArray: "+miArray.joinToString()) // Forma especial para ver todo el array
    
    val miArray2=Array(5){15}
    miArray2[3]=7 // Cambio de valor de una posicion
	println("miArray2: "+ miArray2.joinToString())
    
    // FORMA 02
    val miArray3=intArrayOf(1, 3, 6, 7) // Declaracion explicita de intArray
    println("miArray3: "+ miArray3.joinToString())
    
    /*
     * Tenemos una funcion intArrayOf para cada tipo de dato: boolean, float, etc.
     * */
    
    // FORMA 03
    lateinit var miArray4:Array<String> // Declaracion de array para ser rellenado en el futuro OJO (var no val)

     
    ///// ......... Mas adelante ......../////
    miArray4 = arrayOf("Hola", "alumnos", "fieles") // arrayOf es la mas utilizada!!!
    println("miArray4: "+ miArray4.joinToString())
}