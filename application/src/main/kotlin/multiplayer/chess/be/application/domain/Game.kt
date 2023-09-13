package multiplayer.chess.be.application.domain

class Game(val team1: Team, val team2: Team) {
    val board: Board = Board()
    val currentPlayerIndex: Int = 0
    val history: List<Move> = mutableListOf<Move>()
    val currentPlayer: Player
        get() = if(history.size % 2 == 0) team1.players[currentPlayerIndex] else team2.players[currentPlayerIndex]
}