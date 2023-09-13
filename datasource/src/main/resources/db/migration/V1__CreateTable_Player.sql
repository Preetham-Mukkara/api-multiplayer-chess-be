CREATE TABLE IF NOT EXISTS player {
    player_id SERIAL PRIMARY KEY,
    username TEXT NOT NULL,
    passwd TEXT NOT NULL,
    email TEXT NOT NULL,
    board_state TEXT NOT NULL,
}