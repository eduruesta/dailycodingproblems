package chapter01.division

//Implementa la división de dos números enteros positivos sin utilizar los operadores de división,
// multiplicación o módulo. Devuelve el cociente como un número entero, ignorando el residuo.

fun main(args: Array<String>) {
    println(Division().divide(10, 2))
    println(Multiply().multiply(4, 8))

}

class Division {
    // 10 / 2 = 5 => 10 - 2 - 2 - 2 - 2 - 2 =  n - m veces r
    fun divide(dividend: Int, divisor: Int): Int {
        if (divisor == 0) throw IllegalArgumentException("Cannot divide by zero")
        if (dividend == 0) return 0
        if (dividend == divisor) return 1
        if (divisor == 1) return dividend
        if (divisor == -1) return -dividend

        var result = 0
        var rest = dividend
        while (rest >= divisor) {
            rest -= divisor
            result++
        }
        return result


    }

}

class Multiply {
    // 10 * 2 = 20 => 2 times 10 = 10 + 10
    fun multiply(a: Int, b: Int): Int {
        if (a == 0 || b == 0) return 0
        if (a == 1) return b
        if (b == 1) return a
        if (a == -1) return -b
        if (b == -1) return -a
        var result = 0
        var rest  = b
       /* for (i in 0 until b) {
            result += a
        }*/
        while (rest > 0) {
            result += a
            rest--
        }
        return result
    }
}