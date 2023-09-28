package multiplayer.chess.be.application.domain

data class Game(
    val gameId: Int,
    val whiteTeam: Team,
    val blackTeam: Team,
    val winner: Team?,
    val gameState: GameState
)