CREATE TABLE IF NOT EXISTS game_history (
    game_id SERIAL PRIMARY KEY,
    player_ids INT[] NOT NULL,
    board_state TEXT NOT NULL,
    turn INT NOT NULL,
    game_status TEXT NOT NULL,
    starting_timestamp timestamp NOT NULL DEFAULT now(),
    updated_timestamp timestamp NOT NULL DEFAULT now(),
    finishing_timestamp timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS player (
    player_id SERIAL PRIMARY KEY,
    username TEXT NOT NULL,
    passwd TEXT NOT NULL,
    email TEXT NOT NULL,
    board_state TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS player_history (
    player_id SERIAL PRIMARY KEY,
    game_id INT NOT NULL,
    outcome TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS player_move_history (
    game_id INT NOT NULL,
    player_id INT NOT NULL,
    move_number INT NOT NULL,
    source TEXT NOT NULL,
    destination TEXT NOT NULL
);