CREATE TABLE IF NOT EXISTS move (
    move_id SERIAL PRIMARY KEY,
    game INT NOT NULL,
    player INT NOT NULL,
    move_string TEXT NOT NULL,
    move_timestamp TIMESTAMP DEFAULT NOW(),
    FOREIGN KEY (game) REFERENCES game(game_id),
    FOREIGN KEY (player) REFERENCES player(player_id)
);