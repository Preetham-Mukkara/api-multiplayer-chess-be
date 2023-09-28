package multiplayer.chess.be.datasource.persistance.service

import jakarta.inject.Singleton
import multiplayer.chess.be.datasource.persistance.entity.TeamEntity
import multiplayer.chess.be.datasource.persistance.repository.TeamRepository

@Singleton
class TeamCrudService (
 private val teamRepository: TeamRepository) {

    suspend fun insert (team: TeamEntity): Unit {
        try{
            teamRepository.save(team)
        } catch (e: Error){
            println(e)
        }
    }

}