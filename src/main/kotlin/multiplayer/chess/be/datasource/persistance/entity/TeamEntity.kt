package multiplayer.chess.be.datasource.persistance.entity

import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.GeneratedValue
import javax.persistence.OneToMany
import javax.persistence.Table

@MappedEntity
@Table(name = "team")
data class TeamEntity(
    @field:Id @field:GeneratedValue(GeneratedValue.Type.IDENTITY)
    var teamId: Int,

    var playerOne: PlayerEntity,
    var playerTwo: PlayerEntity
)