package chapter01._05_one_away

import java.lang.Math.abs

//Dado dos cadenas, escriba un método para verificar si hubo edicion
fun main(args: Array<String>) {
    println(OneAway().isOneEditAway("pedras", "pedra"))
}

class OneAway {

    fun isOneEditAway(s1: String, s2: String): Boolean {
        // Verificar si la diferencia de longitud es mayor a 1
        if (abs(s1.length - s2.length) > 1) return false

        // Identificar la cadena más corta y la más larga
        val shorter = if (s1.length < s2.length) s1 else s2
        val longer = if (s1.length < s2.length) s2 else s1

        var index1 = 0
        var index2 = 0
        var foundDifference = false

        // Recorrer ambas cadenas
        while (index1 < shorter.length && index2 < longer.length) {
            if (shorter[index1] != longer[index2]) {
                // Si ya se encontró una diferencia antes, devolver false
                if (foundDifference) return false
                foundDifference = true

                // Si las longitudes son diferentes, mover el índice de la cadena más larga
                if (shorter.length != longer.length) {
                    index2++
                    continue
                }
            }
            // Mover ambos índices hacia adelante
            index1++
            index2++
        }

        // Si se encuentra una diferencia o menos, devolver true
        return true
    }

}