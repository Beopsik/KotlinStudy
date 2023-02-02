import java.lang.StringBuilder

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)

        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}
fun main() {
    println(alphabet())
}
