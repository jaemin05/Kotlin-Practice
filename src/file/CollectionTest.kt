package src.file

fun main() {
    data class Person(val name: String, val age: Int)

    val personList = listOf(
            Person("son", 18),
            Person("Kim", 20)
    )

    println(personList.associateBy { it.age })
    println(personList.groupBy { it.name })

    val (over20, under20) = personList.partition { it.age >= 20 }
    println(over20)

    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.flatMap { listOf(it * 10, it + 10) })

    println(numbers.getOrElse(10) { 50 })
    val names = listOf("A", "B", "C")

    //collection 중 작은 것이 기준이 된다.
    println(numbers zip names)
}