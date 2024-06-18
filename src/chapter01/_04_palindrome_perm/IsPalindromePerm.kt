package chapter01._04_palindrome_perm

//Dado un string, determina si es una permutación de un palíndromo.
//para ser un palindromo como maxido debe tener un caracter que aparece un numero impar de veces
fun main(args: Array<String>) {
    println(IsPalindromePerm().isPalindromePerm("tactcoapapa"))
}

class IsPalindromePerm {

    fun isPalindromePerm(str: String): Boolean {

        //creo un hasmap para recorrer la cadena y guardar el char y la cantidad de veces que aparece
        val strMap = HashMap<Char, Int>()

        // por cada caracter lo guarda en el hashmap donde la clave es el caracter y el valor el numero de veces,
        //si
        str.replace("[^A-Za-z]".toRegex(), "").forEach { strMap[it] = (strMap [it] ?: 0) + 1 }

        // cuenta la cantidad de caracteres que tiene como valor u numero impar
        val oddCharacters = strMap.count { it.value.rem(2) == 1 }

        return oddCharacters <= 1
    }

}