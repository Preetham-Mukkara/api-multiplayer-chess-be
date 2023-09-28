package multiplayer.chess.be.datasource.persistance.entity

import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.GeneratedValue
import multiplayer.chess.be.application.domain.GameState
import javax.persistence.*


@MappedEntity
@Table(name = "game")
data class GameEntity(
    @field:Id @field:GeneratedValue(GeneratedValue.Type.IDENTITY)
    var gameId: Int,

    @OneToMany(mappedBy = "game")
    var moves: List<MoveEntity>,
    @ManyToOne
    @JoinColumn(name = "white_team_id")
    var whiteTeam: TeamEntity,
    @ManyToOne
    @JoinColumn(name = "black_team_id")
    var blackTeam: TeamEntity,
    @ManyToOne
    @JoinColumn(name = "winner_id")
    var winner: TeamEntity?,
    @Enumerated(EnumType.STRING)
    var gameState: GameState
)