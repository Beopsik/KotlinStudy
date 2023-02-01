class Book(val title:String, val authors: List<String>)
fun main() {
    val books= listOf(Book("hello", listOf("Elice", "Bob")), Book("money", listOf("Bob", "Carol")))
    val authors = books.flatMap { it.authors }.toSet()

    println(authors)
}
