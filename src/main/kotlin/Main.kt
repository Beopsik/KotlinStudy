class Person(val firstName: String, val lastName: String) {
    companion object {
    }
}

fun Person.Companion.fromJSON(json: String): Person = Person(json.substringBefore(" "), json.substringAfter(" "))
fun main() {
    var person = Person.fromJSON("BeopSik Moon")
    println("${person.firstName} ${person.lastName}")
}
