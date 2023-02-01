data class Person(val name: String, val age: Int)
fun main() {
    val people= listOf(Person("Alice", 27), Person("Bob", 31), Person("Carol", 27))

    println(people.groupBy{it.age })
}
