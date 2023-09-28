package multiplayer.chess.be.datasource.persistance.dto

import multiplayer.chess.be.application.domain.Team
import multiplayer.chess.be.datasource.persistance.entity.TeamEntity

fun Team.toTeamEntity() = TeamEntity(
    teamId = teamId,
    playerOne = playerOne.toPlayerEntity(),
    playerTwo = playerTwo.toPlayerEntity()
)