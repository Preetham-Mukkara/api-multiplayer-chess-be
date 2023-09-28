CREATE TABLE IF NOT EXISTS game (
    game_id SERIAL PRIMARY KEY,
    white_team_id INT NOT NULL,
    black_team_id INT NOT NULL,
    winner_id INT,
    game_state TEXT NOT NULL,
    FOREIGN KEY (white_team_id) REFERENCES team(team_id),
    FOREIGN KEY (black_team_id) REFERENCES team(team_id),
    FOREIGN KEY (winner_id) REFERENCES team(team_id)
);
