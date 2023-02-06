import java.util.logging.Logger

class Book(val title: String)
fun main() {
    val book = Book("Hello")
        .also { println(it.title) }
        .also { Logger.getAnonymousLogger().info(it.toString()) }
}
