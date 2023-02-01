data class Person(val name: String, val age: Int)
fun main() {
    val people= listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age >= 30 })
    println(people.map { it.name })

    println(people.filter { it.age>=30 }.map { it.name })

    val maxAge=people.maxBy { it.age }!!.age
    println(people.filter { it.age == maxAge })
}
