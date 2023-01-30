interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable")
}

open class RichButton : Clickable {
    fun disable() {}

    open fun animate() {}

    final override fun click() {
        println("Rich Button")
    }
}
fun main() {

}
