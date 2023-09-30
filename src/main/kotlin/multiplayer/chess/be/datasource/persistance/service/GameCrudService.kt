package multiplayer.chess.be.datasource.persistance.service

import jakarta.inject.Singleton
import multiplayer.chess.be.application.domain.Game
import multiplayer.chess.be.datasource.persistance.dto.toGame
import multiplayer.chess.be.datasource.persistance.entity.GameEntity
import multiplayer.chess.be.datasource.persistance.repository.GameRepository

@Singleton
class GameCrudService (
    private val gameRepository: GameRepository
) {
    suspend fun insert(game: GameEntity): Game {
        return gameRepository.save(game).toGame()
    }

    suspend fun fetch(gameId: Int): GameEntity {
        return gameRepository.findByGameId(gameId)
    }

    suspend fun delete(gameId: Int): Unit {
        return gameRepository.deleteByGameId(gameId)
    }

}