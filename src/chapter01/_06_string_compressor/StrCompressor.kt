package chapter01._06_string_compressor

//String Compression: Implement a method to perform basic string compression
// using the counts of repeated characters. For example, the string aabcccccaaa
// would become a2blc5a3, If the "compressed" string would not become smaller than
// the original string, your method should return the original string. You can
// assume the string has only uppercase and lowercase letters (a - z).
fun main(args: Array<String>) {
    println(StringCompressor().compress("aaaabcddeffffghhh"))
}

class StringCompressor {
    fun compress(str: String): String {
        if (!str.matches(Regex("[a-zA-Z]+")))
            throw IllegalArgumentException()
        var idx = 0
        var count: Int
        var currentChar: Char
        val sb = StringBuilder()
        while (idx < str.length) {
            currentChar = str[idx]

            count = 1
            while (idx != str.length - 1 && str[idx + 1] == currentChar) {
                idx++
                count++
            }

            sb.append(currentChar, count)
            idx++
        }

        val result = sb.toString()

        return if (result.length > str.length) str else result
    }

    fun compress2(str: String): String {
        if (!str.matches(Regex("[a-zA-Z]+")))
            throw IllegalArgumentException()

        var index = 0
        var count: Int
        var currentChar: Char
        val sb = StringBuilder()
        while (index < str.length) {
            currentChar = str[index]
            count = 1

            while (index < str.length - 1 && currentChar == str[index + 1]) {
                index++
                count++
            }
            sb.append(currentChar, count)
            index++
        }
        val result = sb.toString()
        return if (result.length < str.length) result else str

    }
}