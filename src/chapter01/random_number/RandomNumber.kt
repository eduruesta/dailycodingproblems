package chapter01.random_number

//Dados dos funciones, rand5() y rand7(), implementa rand5() usando rand7() y que devuelva un número entre 1 y 5.
class RandomNumber {

    fun rand7(): Int {
        // Función que simula rand7(), devuelve un número aleatorio entre 1 y 7.
        return (1..7).random()
    }

    fun rand5(): Int {
        var result = rand7() // Generar un número entre 1 y 7

        // Rechazar valores si el número está fuera del rango deseado
        while (result > 5) {
            result = rand7()
        }

        return result
    }
}

fun main() {
    // Ejemplo de uso:
    println(RandomNumber().rand5()) // Genera un número aleatorio entre 1 y 5
}
