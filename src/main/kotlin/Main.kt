data class Player(val name: String)
class Team(
    val name: String,
    val players: MutableList<Player> = mutableListOf()
) {
    fun addPlayer(vararg people: Player) {
        players.addAll(people)
    }
}
fun main() {
    val team = Team("Warriors")
    team.addPlayer(Player("Curry56"), Player("Thompson"), Player("Durant"), Player("Green"), Player("Cousins"))

    for (player in team.players) {
        println(player)
    }

    operator fun Team.iterator(): Iterator<Player> = players.iterator()
    for (player in team) {
        println(player)
    }
}
