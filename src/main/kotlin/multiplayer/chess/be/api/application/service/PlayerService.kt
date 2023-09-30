package multiplayer.chess.be.api.application.service

import jakarta.inject.Singleton
import multiplayer.chess.be.application.domain.Player
import multiplayer.chess.be.datasource.persistance.service.PlayerCrudService

@Singleton
class PlayerService (private val playerCrudService: PlayerCrudService ) {
    suspend fun insertPlayer(player: Player){
        return playerCrudService.insert(player)
    }
}