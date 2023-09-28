package multiplayer.chess.be.datasource.persistance.dto

import multiplayer.chess.be.application.domain.Player
import multiplayer.chess.be.datasource.persistance.entity.PlayerEntity


fun PlayerEntity.toPlayer() = Player(
    playerId = playerId,
    username = username
)