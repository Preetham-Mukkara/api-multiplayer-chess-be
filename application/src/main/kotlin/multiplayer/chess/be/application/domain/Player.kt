package multiplayer.chess.be.application.domain

data class Player(
    val name: String,
    val color: Color,
    val team: Team
)
