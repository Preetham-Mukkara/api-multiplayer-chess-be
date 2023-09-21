package multiplayer.chess.be.datasource.persistance.service

import jakarta.inject.Singleton
import multiplayer.chess.be.datasource.persistance.entity.PlayerMoveHistoryEntity
import multiplayer.chess.be.datasource.persistance.repository.PlayerMoveHistoryRepository

@Singleton
class MoveCrudService (
    private val playerMoveHistoryRepository: PlayerMoveHistoryRepository
) {
    suspend fun insert(move: PlayerMoveHistoryEntity) :Unit {
        try{
            playerMoveHistoryRepository.save(move)
        }catch(e: Error){
            println(e)
        }
    }

    suspend fun fetch(playerId: Int): PlayerMoveHistoryEntity {
        return playerMoveHistoryRepository.findByPlayerId(playerId)
    }

    suspend fun delete(playerId: Int): Unit {
        return playerMoveHistoryRepository.deleteByPlayerId(playerId)
    }
}