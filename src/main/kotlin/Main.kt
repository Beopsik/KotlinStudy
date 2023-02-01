interface JSONFactory<T>{
    fun fromJSON(jsonText: String): T
}
class Person(val name: String) {
    companion object Loader : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person = Person(jsonText)
    }
}
fun main() {
    var person = Person.fromJSON("{name: 'Dmitry'}")
    println(person.name)

}
