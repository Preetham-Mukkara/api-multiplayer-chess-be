package multiplayer.chess.be.application.domain

import io.micronaut.serde.annotation.Serdeable

@Serdeable.Serializable
data class Piece(
    val type: PieceType,
    val color: Color,
    val position: Position,
)
