package multiplayer.chess.be.datasource.persistance.repository

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import multiplayer.chess.be.datasource.persistance.entity.PlayerEntity

@JdbcRepository(dialect = Dialect.POSTGRES)
interface PlayerRepository: CrudRepository<PlayerEntity,Int> {

    fun save(entity: PlayerEntity): PlayerEntity

    fun findByPlayerId(id: Int): PlayerEntity

    fun deleteByPlayerId(id: Int)

    fun updateByPlayerId(id: Int)
}