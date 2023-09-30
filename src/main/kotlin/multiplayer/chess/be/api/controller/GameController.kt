package multiplayer.chess.be.api.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Post
import multiplayer.chess.be.api.application.service.GameService
import multiplayer.chess.be.api.application.service.PlayerService
import multiplayer.chess.be.application.domain.Game
import multiplayer.chess.be.application.domain.Player

@Controller("/")
class GameController(
    private val gameService: GameService,
    private val playerService: PlayerService
) {
    @Get(value = "/hello")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World!!"
    }

    @Post(value = "/testPlayer")
    @Produces(MediaType.APPLICATION_JSON)
    suspend fun testPlayer(): HttpResponse<*> {
        return try {
            val testPlayer = Player(
                playerId = 0,
                username = "fake"
            )
            HttpResponse.created(playerService.insertPlayer(testPlayer))
        } catch(e: Exception){
            HttpResponse.serverError(e)
        }
    }
}