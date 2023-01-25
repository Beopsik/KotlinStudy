import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)

    return result.toString()
}

open class View{
    open fun click() = println("View Clicked")
}
class Button : View() {
    override fun click() = println("Button Clicked")
}

fun View.showOff() = println("View")
fun Button.showOff() = println("Button")

fun main() {
    val view: View = Button()
    view.click()
    view.showOff()
}
