package multiplayer.chess.be.api.application.service

import jakarta.inject.Singleton
import multiplayer.chess.be.datasource.persistance.service.GameCrudService

@Singleton
class GameService (private val gameCrudService: GameCrudService){

    //TODO
    suspend fun startGame(): Unit{

    }
}