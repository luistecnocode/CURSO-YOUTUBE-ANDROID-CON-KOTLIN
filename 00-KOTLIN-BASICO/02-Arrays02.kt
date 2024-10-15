/**
 * ARRAYS: Trabajando con ellos
 * 
 * it.toInt() ----> Itera cada elemento que es String y conviertelo a Int
 * Luego lo Conviertes a array de Int toIntArray()
 * play.kotlinlang.org
 */

// Los argumentos que se reciben en main, obligatoriamente son Strings
fun main(args:Array<String>) {

	val numeros=args.map{it.toInt()}.toIntArray() // Itera cada elemento y conviertelo a entero
    
    val suma=numeros.sum() // función especias que suma los elementos del array
    
    println("tamaño del array ${numeros.size} numeros.")
    
    // Vamos a hacer un foreach para recorrer los numeros
    for (numero in numeros){
        println("Numero: $numero")
        
    }
    println("La suma de los valores es: $suma")
}