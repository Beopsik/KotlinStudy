fun main() {
    val mutableNums = mutableListOf(3, 1, 4, 1, 5, 9)
    val toList: List<Int> = mutableNums

    println(toList)

    mutableNums.add(2)

    println(toList)
    println(mutableNums)
}
