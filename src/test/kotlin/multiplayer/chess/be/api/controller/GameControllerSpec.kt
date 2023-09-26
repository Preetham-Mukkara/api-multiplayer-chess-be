package multiplayer.chess.be.api.controller

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import jakarta.inject.Inject


@MicronautTest
class GameControllerSpec(
    @Inject @Client("/") private val client: HttpClient
) : FunSpec({

    test("testing /hello"){
        val request = HttpRequest.GET<String>("/hello")
        val response = client.toBlocking().retrieve(request)

        response shouldBe "Hello World!!"
    }

})
