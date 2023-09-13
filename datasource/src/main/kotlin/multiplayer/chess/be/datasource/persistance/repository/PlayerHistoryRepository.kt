package multiplayer.chess.be.datasource.persistance.repository

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import multiplayer.chess.be.datasource.persistance.entity.PlayerHistoryEntity

@JdbcRepository(dialect = Dialect.POSTGRES)
interface PlayerHistoryRepository: CrudRepository<PlayerHistoryEntity,Int> {

    fun save(entity: PlayerHistoryEntity): PlayerHistoryEntity

    fun findByPlayerId(id: Int): PlayerHistoryEntity

    fun deleteByPlayerId(id: Int)

    fun updateByPlayerId(id: Int)

}