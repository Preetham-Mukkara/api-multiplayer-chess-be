package multiplayer.chess.be.application.domain

class Board {
    val squares: Array<Array<Piece?>> = Array(8) {Array(8) {null} }
}