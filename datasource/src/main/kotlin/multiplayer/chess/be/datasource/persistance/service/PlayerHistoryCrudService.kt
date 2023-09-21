package multiplayer.chess.be.datasource.persistance.service

import jakarta.inject.Singleton
import multiplayer.chess.be.datasource.persistance.entity.PlayerHistoryEntity
import multiplayer.chess.be.datasource.persistance.repository.PlayerHistoryRepository

@Singleton
class PlayerHistoryCrudService (
 private val playerHistoryRepository: PlayerHistoryRepository) {

    suspend fun insert (game: PlayerHistoryEntity): Unit {
        try{
            playerHistoryRepository.save(game)
        } catch (e: Error){
            println(e)
        }
    }

    suspend fun fetch(playerId: Int): PlayerHistoryEntity{
        return playerHistoryRepository.findByPlayerId(playerId)
    }

    suspend fun delete(playerId: Int): Unit{
        return playerHistoryRepository.deleteByPlayerId(playerId)
    }
}