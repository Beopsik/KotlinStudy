data class Person(val name: String, val age: Int)
fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })

    val names=people.joinToString(" ") { it.name }
    println(names)

    val sum = {x: Int, y:Int ->
        println("Computing the sum of $x and $y...")
        x+y
    }
    println(sum(1, 2))
}
