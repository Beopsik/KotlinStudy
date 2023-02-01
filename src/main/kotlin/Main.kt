import java.io.File

fun main() {
    fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }
    val file = File("/Users/svtk/.HiddenDir/a.txt")

    println(file.isInsideHiddenDirectory())
}
