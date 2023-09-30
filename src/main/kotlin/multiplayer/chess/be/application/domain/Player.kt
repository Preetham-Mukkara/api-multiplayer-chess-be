package multiplayer.chess.be.application.domain

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Player(
    @JsonProperty("playerId")
    val playerId: Int,
    @JsonProperty("username")
    val username: String,
)
