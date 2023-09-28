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

    suspend fun fetch(moveId: Int): MoveEntity {
        return moveRepository.findByMoveId(moveId)
    }

    suspend fun delete(moveId: Int): Unit {
        return moveRepository.deleteByMoveId(moveId)
    }
}