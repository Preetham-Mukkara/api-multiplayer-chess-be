package multiplayer.chess.be.datasource.persistance.dto

import multiplayer.chess.be.application.domain.Game
import multiplayer.chess.be.datasource.persistance.entity.GameEntity
import multiplayer.chess.be.datasource.persistance.entity.MoveEntity


fun Game.toGameEntity(moves: List<MoveEntity>) = GameEntity(
    gameId = gameId,
    moves = moves,
    whiteTeam = whiteTeam.toTeamEntity(),
    blackTeam = blackTeam.toTeamEntity(),
    winner = winner?.toTeamEntity(),
    gameState = gameState
)