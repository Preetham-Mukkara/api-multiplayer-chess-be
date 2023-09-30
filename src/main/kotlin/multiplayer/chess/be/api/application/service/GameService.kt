package multiplayer.chess.be.api.application.service

import jakarta.inject.Singleton
import multiplayer.chess.be.application.domain.*
import multiplayer.chess.be.datasource.persistance.dto.toGameEntity
import multiplayer.chess.be.datasource.persistance.entity.MoveEntity
import multiplayer.chess.be.datasource.persistance.service.GameCrudService

@Singleton
class GameService (private val gameCrudService: GameCrudService){

    //TODO
    suspend fun startGame(): Unit{

    }

    suspend fun insertGame(game: Game, moves: List<MoveEntity>): Game {
        return gameCrudService.insert(game.toGameEntity(moves))
    }
}