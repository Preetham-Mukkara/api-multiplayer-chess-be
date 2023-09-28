package multiplayer.chess.be.datasource.persistance.dto

import multiplayer.chess.be.application.domain.Team
import multiplayer.chess.be.datasource.persistance.entity.TeamEntity


fun TeamEntity.toTeam() = Team(
    teamId = teamId,
    playerOne = playerOne.toPlayer(),
    playerTwo = playerTwo.toPlayer(),
)