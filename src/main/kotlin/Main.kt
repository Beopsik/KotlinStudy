class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val lc = LengthCounter()
    lc.addWord("word")
    println(lc.counter)
}
