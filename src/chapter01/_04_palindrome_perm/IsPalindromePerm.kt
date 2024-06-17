package chapter01._04_palindrome_perm

//Dado un string, determina si es una permutación de un palíndromo.
fun main(args: Array<String>) {
    println(IsPalindromePerm().isPalindromePerm("tactcoapapa"))
}

class IsPalindromePerm {

    fun isPalindromePerm(str: String): Boolean {

        val strMap = HashMap<Char, Int>()

        str.replace("[^A-Za-z]".toRegex(), "").forEach { strMap[it] = (strMap [it] ?: 0) + 1 }

        val oddCharacters = strMap.count { it.value.rem(2) == 1 }

        return oddCharacters <= 1
    }

}