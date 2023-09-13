CREATE TABLE IF NOT EXISTS player_history {
    player_id SERIAL PRIMARY KEY,
    game_id INT NOT NULL,
    outcome TEXT NOT NULL
}