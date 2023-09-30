package multiplayer.chess.be.application.domain

import io.micronaut.serde.annotation.Serdeable

@Serdeable.Serializable
data class Game(
    val gameId: Int,
    val whiteTeam: Team,
    val blackTeam: Team,
    val winner: Team?,
    val gameState: GameState
)