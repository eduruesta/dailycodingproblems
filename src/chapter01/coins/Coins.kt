package chapter01.coins

import chapter01.division.Division
import chapter01.division.Multiply

//You have n fair coins and you flip them all at the same time.
// Any that come up heads you set aside. The ones that come up tails you flip again.
// How many rounds do you expect to play before only one coin remains?
//Write a function that, given n, returns the number of rounds you'd expect to play
// until one coin remains.
// 2/2 = 1
fun main(args: Array<String>) {
    println(Coins().coins(10))

}
class Coins {

    fun coins(n: Int): Int {
        if (n < 1) throw IllegalArgumentException("n must be greater than 0")
        if (n == 1) return 0
        return 1 + coins(n / 2)
    }
}