package multiplayer.chess.be.datasource.persistance.entity

import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.GeneratedValue
import multiplayer.chess.be.application.domain.Position
import java.time.LocalDateTime
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@MappedEntity
@Table(name = "move")
data class MoveEntity(
    @field:Id @field:GeneratedValue(GeneratedValue.Type.IDENTITY)
    var moveId: Int,

    @ManyToOne
    @JoinColumn(name = "game_id")
    val game: GameEntity,
    @ManyToOne
    @JoinColumn(name = "player_id")
    val player: PlayerEntity,
    val moveString: String,
    val moveTimestamp: LocalDateTime
)