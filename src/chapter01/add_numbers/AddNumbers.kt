package chapter01.add_numbers

import chapter01.coins.Coins

//Given a list of numbers and a number k, return whether any two numbers from
// the list add up to k.
//For example, given [10, 2, 3, 7] and k of 12, return true since 10 + 2 is 12.
fun main(args: Array<String>) {
    println(AddNumbers().addNumbers(listOf(10,2,4), k = 14))

}
class AddNumbers {

    fun addNumbers(list: List<Int>, k: Int): Boolean {
        val set = mutableSetOf<Int>()
        list.forEach {
            if (set.contains(k - it)) {
                return true
            } else {
                set.add(it)
            }
        }
        return false
    }
}