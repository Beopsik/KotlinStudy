fun <T:Any> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main() {
//    printHashCode(null)
    printHashCode(42)
}
