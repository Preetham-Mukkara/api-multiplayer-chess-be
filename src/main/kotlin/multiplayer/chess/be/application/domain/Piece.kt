package multiplayer.chess.be.application.domain

data class Piece(
    val type: PieceType,
    val color: Color,
    val position: Position,
)
