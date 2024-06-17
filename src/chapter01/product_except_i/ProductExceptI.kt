package chapter01.product_except_i

//Dado un array de enteros, devuelve un array de igual tamaño donde cada elemento es el producto de
// todos los elementos del array original excepto el elemento en la misma posición.
fun main(args: Array<String>) {
    println(ProductExceptI().productExceptI(listOf(1, 2, 3)))
}
class ProductExceptI {

    fun productExceptI(arr: List<Int>): List<Int> {
        val product = productValue(arr)
        val result = arr.map { product / it }
        return result
    }

    private fun productValue(arr: List<Int>): Int {
        var product = 1
        for (i in arr) {
            product *= i
        }
        return product
    }
}