package multiplayer.chess.be.application.domain

import io.micronaut.serde.annotation.Serdeable

@Serdeable.Serializable
class Board {
    val squares: Array<Array<Piece?>> = Array(8) {Array(8) {null} }
}