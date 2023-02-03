fun yellAt(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}
fun main() {
    yellAt(Person(null))
}
