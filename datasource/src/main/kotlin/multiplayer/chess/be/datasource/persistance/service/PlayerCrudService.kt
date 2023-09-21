package multiplayer.chess.be.datasource.persistance.service

import jakarta.inject.Singleton
import multiplayer.chess.be.datasource.persistance.entity.PlayerEntity
import multiplayer.chess.be.datasource.persistance.repository.PlayerRepository

@Singleton
class PlayerCrudService (
    private val playerRepository: PlayerRepository
){
    suspend fun insert(player: PlayerEntity): Unit {
        try{
            playerRepository.save(player)
        } catch (e: Error){
            println(e)
        }
    }

    suspend fun fetch(playerId: Int): PlayerEntity{
        return playerRepository.findByPlayerId(playerId)
    }

    suspend fun delete(playerId: Int): Unit {
        return playerRepository.deleteByPlayerId(playerId)
    }
}