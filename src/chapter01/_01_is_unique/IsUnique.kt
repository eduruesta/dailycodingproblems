package chapter01._01_is_unique

//Dado un strting, determina si todos los caracteres son únicos.
fun main(args: Array<String>) {
    println(IsUnique().isUniqueBest(""))
}

class IsUnique {

    // O(n) solution
    fun isUniqueBest(str: String) = str.length == str.toSet().size

    fun isUniqueChar(str: String) : Boolean {
        return (str.length == str.toSet().size)
    }

    fun isUniqueTwo(str: String) = str.length == str.toSet().size


    // O(n) solution
    fun isUniqueBetter(str: String): Boolean {
        val charSet: MutableSet<Char> = mutableSetOf()
        str.forEach {
            if (it in charSet)
                return false
            else
                charSet.add(it)
        }
        return true
    }

    // O(nlog(n)) solution (space complexity = O(n))
    fun isUniqueNormal(str: String): Boolean {
        val charList: List<Char> = str.toList().sorted()

        for ((index, value) in charList.withIndex()) {
            if (index == charList.size - 1)
                return true
            else if (value == charList[index + 1])
                return false
        }
        return true
    }

}