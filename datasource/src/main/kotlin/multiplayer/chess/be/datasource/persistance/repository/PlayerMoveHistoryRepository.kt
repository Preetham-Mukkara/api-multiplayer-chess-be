package multiplayer.chess.be.datasource.persistance.repository

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import multiplayer.chess.be.datasource.persistance.entity.PlayerMoveHistoryEntity

@JdbcRepository(dialect = Dialect.POSTGRES)
interface PlayerMoveHistoryRepository: CrudRepository<PlayerMoveHistoryEntity,Int> {

    fun save(entity: PlayerMoveHistoryEntity): PlayerMoveHistoryEntity

    fun findByPlayerId(id: Int): PlayerMoveHistoryEntity

    fun deleteByPlayerId(id: Int)

    fun updateByPlayerId(id: Int)

}