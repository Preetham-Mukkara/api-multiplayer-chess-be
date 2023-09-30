package multiplayer.chess.be.application.domain

import io.micronaut.serde.annotation.Serdeable
import java.time.LocalDateTime
@Serdeable.Serializable
data class Move(
    val moveId: Int,
    val game: Game,
    val player: Player,
    val moveString: String,
    val moveTimestamp: LocalDateTime,
)
