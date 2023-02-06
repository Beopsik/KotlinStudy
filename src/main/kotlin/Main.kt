fun processString(str: String?) =
    str?.let {
        when {
            it.isEmpty() -> "Empty"
            it.isBlank() -> "Blank"
            else -> it.toUpperCase()
        }
    } ?: "Null"
fun main() {
    println(processString("hello"))
}
