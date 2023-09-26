package multiplayer.chess.be.datasource.persistance.service

import multiplayer.chess.be.datasource.persistance.entity.GameHistoryEntity
import multiplayer.chess.be.datasource.persistance.repository.GameHistoryRepository

class GameCrudService (
    private val gameHistoryRepository: GameHistoryRepository
) {
    suspend fun insert(game: GameHistoryEntity): Unit{
        try{
            gameHistoryRepository.save(game)
        } catch (e: Error) {
            println(e)
        }
    }

    suspend fun fetch(gameId: Int): GameHistoryEntity {
        return gameHistoryRepository.findByGameId(gameId)
    }

    suspend fun delete(gameId: Int): Unit {
        return gameHistoryRepository.deleteByGameId(gameId)
    }

    suspend fun update(gameId: Int): Unit {
        return gameHistoryRepository.updateByGameId(gameId)
    }
}