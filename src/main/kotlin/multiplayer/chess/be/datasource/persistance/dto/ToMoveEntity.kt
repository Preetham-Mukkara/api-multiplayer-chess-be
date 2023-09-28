package multiplayer.chess.be.datasource.persistance.dto

import multiplayer.chess.be.application.domain.Move
import multiplayer.chess.be.datasource.persistance.entity.GameEntity
import multiplayer.chess.be.datasource.persistance.entity.MoveEntity

fun Move.toMoveEntity(gameEntity: GameEntity) = MoveEntity(
    moveId = moveId,
    game = gameEntity,
    player = player.toPlayerEntity(),
    moveString = moveString,
    timestamp = timestamp
)