data class Num(val num1: Int, val num2: Int, val num3: Int, val num4: Int, val num5: Int, val num6: Int)
fun main() {
    val list = listOf("a", "b", "c", "d", "e", "f", "g", "h")
    val (a, b, c, d, e) = list
    println("$a, $b, $c, $d, $e")

    val numData = Num(1, 2, 3, 4, 5, 6)
    val (n1, n2, n3, n4, n5, n6) = numData
    println("$n1, $n2, $n3, $n4, $n5, $n6")
}
