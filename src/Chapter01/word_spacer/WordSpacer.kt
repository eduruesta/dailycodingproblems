package Chapter01.word_spacer
//Dado un string s y un entero k, divide el string en múltiples líneas de forma que cada línea tenga
// una longitud de k caracteres o menos. Debes dividirlo de manera que las palabras no se rompan entre
// líneas. Cada línea debe contener la mayor cantidad de palabras posible. Si no hay forma de dividir el
// texto, devuelve null.
fun main(args: Array<String>) {
    println(WordSpacer().wordSpacer("the quick brown fox jumps over the lazy dog", 10))
}
class WordSpacer {

    fun wordSpacer(str: String, n: Int): String {
        val words = str.split(" ")
        val result = mutableListOf<String>()
        var currentLine = ""
        for (word in words) {
            if (currentLine.isEmpty()) {
                currentLine = word
            } else if (currentLine.length + word.length + 1 <= n) {
                currentLine += " $word"
            } else {
                result.add(currentLine)
                currentLine = word
            }
        }
        result.add(currentLine) //agrega la ultima palabra en este caso dog
        return result.joinToString("\n")

    }

}