fun main() {
    listOf(1, 2, 3, 4).asSequence()
        .map { println("map($it) "); it * it }
        .filter { println("filter ($it) "); it % 2 == 0 }
        .toList()
}
