package multiplayer.chess.be.datasource.persistance.entity

import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.GeneratedValue
import javax.persistence.Table

@MappedEntity
@Table(name = "player_history")
data class PlayerHistoryEntity(
    @field:Id @field:GeneratedValue(GeneratedValue.Type.IDENTITY)
    var playerId: Int,

    var gameId: Int,
    var outcome: String,
)