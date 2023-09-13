package multiplayer.chess.be.datasource.persistance.entity

import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.GeneratedValue
import javax.persistence.Table


@MappedEntity
@Table(name = "player")
data class PlayerEntity(
    @field:Id @field:GeneratedValue(GeneratedValue.Type.IDENTITY)
    var playerId: Int,

    var username: String,
    var passwd: String,
    var email: String,
)