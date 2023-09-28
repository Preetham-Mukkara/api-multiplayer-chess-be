package multiplayer.chess.be.datasource.persistance.repository

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import multiplayer.chess.be.datasource.persistance.entity.GameEntity

@JdbcRepository(dialect = Dialect.POSTGRES)
interface GameRepository: CrudRepository<GameEntity,Int> {

    fun save(entity: GameEntity): GameEntity

    fun findByGameId(id: Int): GameEntity

    fun deleteByGameId(id: Int)

    fun updateByGameId(id: Int)

}