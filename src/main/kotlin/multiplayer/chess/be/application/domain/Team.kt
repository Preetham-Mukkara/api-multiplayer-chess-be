package multiplayer.chess.be.application.domain

data class Team(
    val teamId: Int,
    val playerOne: Player,
    val playerTwo: Player
)
