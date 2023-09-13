package multiplayer.chess.be.datasource.persistance.entity

import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.DateUpdated
import io.micronaut.data.annotation.GeneratedValue
import javax.persistence.Table
import java.time.Instant


@MappedEntity
@Table(name = "game_history")
data class GameHistoryEntity(
    @field:Id @field:GeneratedValue(GeneratedValue.Type.IDENTITY)
    var gameId: Int,

    var playerIds: List<Int> = mutableListOf<Int>(),
    var boardState: String,
    var turn: Int,
    var gameStatus: String,
    var startingTimestamp: Instant?,
    var finishingTimestamp: Instant?,
    @DateUpdated
    var updatedTimestamp: Instant?
)