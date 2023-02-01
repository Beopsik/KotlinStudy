data class Person(val name: String, val age: Int)
fun main() {
    val people= listOf(Person("Alice", 27), Person("Bob", 31))
    val canBeInClub27={p:Person-> p.age <= 27}

    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))
}
