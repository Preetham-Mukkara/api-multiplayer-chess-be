package multiplayer.chess.be.application.domain

import io.micronaut.serde.annotation.Serdeable

@Serdeable.Serializable
data class Team(
    val teamId: Int,
    val playerOne: Player,
    val playerTwo: Player
)
