package multiplayer.chess.be.api.controller

import io.kotest.core.spec.style.funSpec
import io.kotest.matchers.shouldBe
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import jakarta.inject.Inject
import mu.KotlinLogging


@MicronautTest
class GameControllerSpec(
    @Inject @Client("/") private val client: HttpClient
) {

    companion object {
        val log = KotlinLogging.logger {}
    }
    fun test() = funSpec {
        test("testing /hello") {
            val request = HttpRequest.GET<String>("/hello")
            val response = client.toBlocking().retrieve(request)

            log.debug{response}
            response shouldBe "Hello World!!"
        }
    }
}
