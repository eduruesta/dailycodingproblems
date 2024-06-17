package chapter01.duplicate_number

//Se te da un array de longitud n + 1 cuyos elementos pertenecen al conjunto
// {1, 2, ..., n}. Por el principio del palomar, debe haber un duplicado.
// Encuéntralo en tiempo y espacio lineal.
fun main() {
    println(DuplicateNumber().duplicateNumber(listOf(1,2,3,4,5,6,7,8,2,10)))
}
class DuplicateNumber {

    fun duplicateNumber(list: List<Int>): Int {
        //puedo recorrer la lista y guardarlos en un set, si
        // existe en el set devuelvo ese numero
        val uniqueNumbers = mutableSetOf<Int>()
        list.forEach { number ->
            if (uniqueNumbers.contains(number)) {
                return number
            } else {
                uniqueNumbers.add(number)
            }
        }
        return 0
    }
}