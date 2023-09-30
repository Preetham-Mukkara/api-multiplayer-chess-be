package multiplayer.chess.be.datasource.persistance.service

import jakarta.inject.Singleton
import multiplayer.chess.be.application.domain.Player
import multiplayer.chess.be.datasource.persistance.dto.toPlayer
import multiplayer.chess.be.datasource.persistance.dto.toPlayerEntity
import multiplayer.chess.be.datasource.persistance.entity.PlayerEntity
import multiplayer.chess.be.datasource.persistance.repository.PlayerRepository

@Singleton
class PlayerCrudService (
    private val playerRepository: PlayerRepository
){
    suspend fun insert(player: Player): Player {
        return playerRepository.save(player.toPlayerEntity()).toPlayer()
    }

    suspend fun fetch(playerId: Int): PlayerEntity{
        return playerRepository.findByPlayerId(playerId)
    }

    suspend fun delete(playerId: Int): Unit {
        return playerRepository.deleteByPlayerId(playerId)
    }
}