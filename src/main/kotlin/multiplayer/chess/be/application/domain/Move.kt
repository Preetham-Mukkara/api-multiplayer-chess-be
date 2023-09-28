package multiplayer.chess.be.application.domain

import java.time.LocalDateTime

data class Move(
    val moveId: Int,
    val game: Game,
    val player: Player,
    val moveString: String,
    val timestamp: LocalDateTime,
)
