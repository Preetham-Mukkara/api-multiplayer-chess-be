package multiplayer.chess.be.application.domain

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Player(
    val playerId: Int,
    val username: String,
)
