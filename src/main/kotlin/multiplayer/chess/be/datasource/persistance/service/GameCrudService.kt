package multiplayer.chess.be.datasource.persistance.service

import multiplayer.chess.be.datasource.persistance.entity.GameEntity
import multiplayer.chess.be.datasource.persistance.repository.GameRepository

class GameCrudService (
    private val gameRepository: GameRepository
) {
    suspend fun insert(game: GameEntity): Unit{
        try{
            gameRepository.save(game)
        } catch (e: Error) {
            println(e)
        }
    }

    suspend fun fetch(gameId: Int): GameEntity {
        return gameRepository.findByGameId(gameId)
    }

    suspend fun delete(gameId: Int): Unit {
        return gameRepository.deleteByGameId(gameId)
    }

    suspend fun update(gameId: Int): Unit {
        return gameRepository.updateByGameId(gameId)
    }
}