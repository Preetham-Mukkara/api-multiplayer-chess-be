package multiplayer.chess.be.datasource.persistance.dto

import multiplayer.chess.be.application.domain.Game
import multiplayer.chess.be.datasource.persistance.entity.GameEntity


fun GameEntity.toGame() = Game(
    gameId = gameId,
    whiteTeam = whiteTeam.toTeam(),
    blackTeam = blackTeam.toTeam(),
    winner = winner?.toTeam(),
    gameState = gameState
)