package chapter01._03_urlify

//Crea un método que reciba un string y devuelva un string con los
// espacios reemplazados por '%20'.
fun main(args: Array<String>) {
    val input = "Mr John Smith"
    println(Urlify().urlfy(input))
}

class Urlify {

    fun urlfy(input: String): String {
        // Step 1: Replace all spaces with '%20'
        val modifiedString = input.replace(" ", "%20")

        // Step 2: Return the modified string
        return modifiedString
    }
}