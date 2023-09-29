package multiplayer.chess.be.api.application.service

import jakarta.inject.Singleton
import multiplayer.chess.be.application.domain.*
import multiplayer.chess.be.datasource.persistance.dto.toGameEntity
import multiplayer.chess.be.datasource.persistance.service.GameCrudService

@Singleton
class GameService (private val gameCrudService: GameCrudService){

    //TODO
    suspend fun startGame(): Unit{

    }

    suspend fun insertTestGame(): Game {
        val testPlayer = Player(
            playerId = 0,
            username = "fake"
        )
        val testTeam = Team(
            teamId = 0,
            playerOne = testPlayer,
            playerTwo = testPlayer.copy(playerId = 1)
        )
        val testGame = Game(
            gameId = 0,
            whiteTeam = testTeam,
            blackTeam = testTeam.copy(
                teamId = 1,
                playerOne = testPlayer.copy(playerId = 2),
                playerTwo = testPlayer.copy(playerId = 3)),
            winner = null,
            gameState = GameState.DRAW
        )
        return gameCrudService.insert(testGame.toGameEntity(null))
    }
}