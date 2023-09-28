package multiplayer.chess.be.datasource.persistance.dto

import multiplayer.chess.be.application.domain.Move
import multiplayer.chess.be.datasource.persistance.entity.MoveEntity


fun MoveEntity.toMove() = Move(
    moveId = moveId,
    game = game.toGame(),
    player = player.toPlayer(),
    moveString = moveString,
    moveTimestamp = moveTimestamp
)