import java.time.LocalDate

fun main() {
    val list = listOf("a", LocalDate.now(), 3, 1, 4, "b")

//    val strings = list.filterIsInstance<String>()
//    val ints = list.filterIsInstance<Int>()
//    val dates = list.filterIsInstance(LocalDate::class.java)

    val strings = list.filterIsInstanceTo(mutableListOf<String>())
    val ints = list.filterIsInstanceTo(mutableListOf<Int>())
    val dates = list.filterIsInstanceTo(mutableListOf<LocalDate>())

    println(strings)
    println(ints)
    println(dates)
}
