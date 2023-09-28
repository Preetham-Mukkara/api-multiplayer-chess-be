package multiplayer.chess.be.datasource.persistance.service

import jakarta.inject.Singleton
import multiplayer.chess.be.datasource.persistance.entity.MoveEntity
import multiplayer.chess.be.datasource.persistance.repository.MoveRepository

@Singleton
class MoveCrudService (
    private val moveRepository: MoveRepository
) {
    suspend fun insert(move: MoveEntity) :Unit {
        try{
            moveRepository.save(move)
        }catch(e: Error){
            println(e)
        }
    }

    suspend fun fetch(playerId: Int): MoveEntity {
        return moveRepository.findByPlayerId(playerId)
    }

    suspend fun delete(playerId: Int): Unit {
        return moveRepository.deleteByPlayerId(playerId)
    }
}