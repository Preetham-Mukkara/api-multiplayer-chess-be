CREATE TABLE IF NOT EXISTS game_history {
    game_id SERIAL PRIMARY KEY,
    player_ids LIST(INT NOT NULL),
    board_state TEXT NOT NULL,
    turn INT NOT NULL,
    game_status TEXT NOT NULL,
    starting_timestamp timestamp NOT NULL DEFAULT now(),
    updated_timestamp timestamp NOT NULL DEFAULT now(),
    finishing_timestamp timestamp NOT NULL,
}