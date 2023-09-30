package multiplayer.chess.be.application.domain

import io.micronaut.serde.annotation.Serdeable

@Serdeable.Serializable
data class Position(
    val row: Int,
    val col: Int
)
