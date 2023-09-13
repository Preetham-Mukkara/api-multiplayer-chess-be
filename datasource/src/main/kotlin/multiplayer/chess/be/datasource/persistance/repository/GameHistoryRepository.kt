package multiplayer.chess.be.datasource.persistance.repository

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import multiplayer.chess.be.datasource.persistance.entity.GameHistoryEntity

@JdbcRepository(dialect = Dialect.POSTGRES)
interface GameHistoryRepository: CrudRepository<GameHistoryEntity,Int> {

    fun save(entity: GameHistoryEntity): GameHistoryEntity

    fun findByGameId(id: Int): GameHistoryEntity

    fun deleteByGameId(id: Int)

    fun updateByGameId(id: Int)

}