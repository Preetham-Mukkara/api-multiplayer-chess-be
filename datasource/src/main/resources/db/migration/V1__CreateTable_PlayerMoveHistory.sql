CREATE TABLE IF NOT EXISTS player_move_history {
    game_id INT NOT NULL,
    player_id INT NOT NULL,
    move_number INT NOT NULL,
    source TEXT NOT NULL,
    destination TEXT NOT NULL
}