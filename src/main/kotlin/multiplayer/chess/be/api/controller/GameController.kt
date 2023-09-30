package multiplayer.chess.be.api.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Post
import multiplayer.chess.be.api.application.service.GameService
import multiplayer.chess.be.application.domain.Game

@Controller("/")
class GameController(
    private val gameService: GameService
) {
    @Get(value = "/hello")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World!!"
    }

    @Post(value = "/testGame")
    @Produces(MediaType.APPLICATION_JSON)
    suspend fun testGame(): HttpResponse<*> {
        return try {
            HttpResponse.created(gameService.insertTestGame())
        } catch(e: Exception){
            HttpResponse.serverError(e)
        }
    }
}