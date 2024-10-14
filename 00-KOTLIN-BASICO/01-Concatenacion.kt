/**
 * Las constantes sólo pueden declararse en Clase
 * Utilizaremos val
 * REFERENCIAS
 *      play.kotlinlang.org
 *      https://youtube.com/playlist?list=PLU8oAlHdN5BkdfBPpNv_lVCJxJgE87cr0&si=_ABy8_Jo8ZsWlyFN
 */
fun main() {
    var edadJuan:Int=21 // Variable mutable
    
    // Definicion de Constante
    val nombrePersona:String="Juan" // Variable inmutable (igual que final en java)
    
    // Concatenaciones
    println("La edad de Juan es " + edadJuan)
    println("Un año despues,...")
    
    edadJuan++
    println("(con +) La edad de Juan es " + edadJuan)
    
    // Mediante String Templates ---> Casi siempre es la forma de Kotlin
    println("(Con $edadJuan) La edad de Juan es $edadJuan") 
    
    // Con String.format
    println(String.format("(Con String.format) La edad de Juan es: %d", edadJuan))
    
    // Con toString
    println("(Con toString)La edad de Juan es " + edadJuan.toString())
}