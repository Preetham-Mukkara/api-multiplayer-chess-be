package multiplayer.chess.be.datasource.persistance.repository

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import multiplayer.chess.be.datasource.persistance.entity.MoveEntity

@JdbcRepository(dialect = Dialect.POSTGRES)
interface MoveRepository: CrudRepository<MoveEntity,Int> {

    fun save(entity: MoveEntity): MoveEntity

    fun findByPlayerId(playerId: Int): MoveEntity

    fun deleteByPlayerId(playerId: Int)

}