package multiplayer.chess.be.datasource.persistance.repository

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import multiplayer.chess.be.datasource.persistance.entity.TeamEntity

@JdbcRepository(dialect = Dialect.POSTGRES)
interface TeamRepository: CrudRepository<TeamEntity,Int> {
    fun save(entity: TeamEntity): TeamEntity

}