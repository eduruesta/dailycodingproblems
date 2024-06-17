package chapter01.anagrama
//Una palabra escalonada se forma tomando una palabra dada, añadiendo una letra
// y anagramando el resultado. Por ejemplo, comenzando
// con la palabra "MANZANA", puedes añadir una "S" y anagramar
// para obtener "ANZANAS".  Dado un diccionario de palabras y
// una palabra de entrada, crea una función que devuelva todas las
// palabras escalonadas válidas.

fun main() {
    val dictionary = setOf("manzanas", "anzanas", "manzana", "zananas", "naranjas", "peras")
    val word = "manzana"

    val stepWords = Anagrama().findStepWords(dictionary, word)

    println("Las palabras escalonadas para '$word' son: $stepWords")
}
class Anagrama {

    fun generateAnagrams(word: String): Set<String> {
        val anagrams = mutableSetOf<String>()
        val alphabet = "abcdefghijklmnopqrstuvwxyz"

        for (letter in alphabet) {
            val extendedWord = word + letter
            extendedWord.toCharArray().toList().permutations().forEach { permutation ->
                anagrams.add(permutation.joinToString(""))
            }
        }

        return anagrams
    }

    private fun <T> List<T>.permutations(): List<List<T>> {
        if (this.size == 1) return listOf(this)
        val perms = mutableListOf<List<T>>()
        val toInsert = this[0]
        for (perm in this.drop(1).permutations()) {
            for (i in 0..perm.size) {
                val newPerm = perm.toMutableList()
                newPerm.add(i, toInsert)
                perms.add(newPerm)
            }
        }
        return perms
    }

    fun findStepWords(dictionary: Set<String>, word: String): Set<String> {
        val stepWords = mutableSetOf<String>()
        val anagrams = generateAnagrams(word)

        for (anagram in anagrams) {
            if (dictionary.contains(anagram)) {
                stepWords.add(anagram)
            }
        }

        return stepWords
    }
}
