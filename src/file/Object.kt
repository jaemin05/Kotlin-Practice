package src.file

import src.`class`.FoodPoll

fun main() {
    println(Counter.count)

    var a = FoodPoll("짜장면")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()

    println("${FoodPoll.total}")
}

object Counter {
    var count = 0

    fun countUp() {
        count += 1
    }

    fun countDown() {
        count -= 1
    }

    fun clear() {
        count = 0
    }
}
