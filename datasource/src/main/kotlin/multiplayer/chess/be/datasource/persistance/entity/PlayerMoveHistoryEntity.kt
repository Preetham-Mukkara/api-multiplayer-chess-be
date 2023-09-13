package multiplayer.chess.be.datasource.persistance.entity

import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.GeneratedValue
import javax.persistence.Table

@MappedEntity
@Table(name = "player_move_history")
data class PlayerMoveHistoryEntity(
    @field:Id @field:GeneratedValue(GeneratedValue.Type.IDENTITY)
    var gameId: Int,

    var moveNumber: Int,
    var playerId: Int,
    var source: String,
    var destination: String,
)