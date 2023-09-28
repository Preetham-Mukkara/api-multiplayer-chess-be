package multiplayer.chess.be.datasource.persistance.dto

import multiplayer.chess.be.application.domain.Player
import multiplayer.chess.be.datasource.persistance.entity.PlayerEntity


fun Player.toPlayerEntity() = PlayerEntity(
    playerId = playerId,
    username = username
)