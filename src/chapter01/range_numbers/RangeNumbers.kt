package chapter01.range_numbers

//Dados dos enteros N y X, crea una función que devuelva cuántas veces aparece X en una tabla de
// multiplicación de N x N.
class RangeNumbers {
fun countOccurrencesInMultiplicationTable(rangeNumbers: Int, X: Int): Int {
    var count = 0

    // Iterate through each pair (i, j) in the N x N multiplication table
    for (i in 1..rangeNumbers) {
        for (j in 1..rangeNumbers) {
            val product = i * j
            if (product == X) {
                count++
            } else if (product > X) {
                // Since products increase as i and j increase, no need to continue if product > X
                break
            }
        }
    }

    return count
}
}

fun main() {
    // Example usage
    println(RangeNumbers().countOccurrencesInMultiplicationTable(6, 12)) // Output: 4
    println(RangeNumbers().countOccurrencesInMultiplicationTable(4, 8)) // Output: 1
    println(RangeNumbers().countOccurrencesInMultiplicationTable(3, 5))  // Output: 0
}