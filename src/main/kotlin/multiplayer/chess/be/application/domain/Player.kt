package multiplayer.chess.be.application.domain

import io.micronaut.serde.annotation.Serdeable

@Serdeable.Serializable
data class Player(
    val playerId: Int,
    val username: String,
)
