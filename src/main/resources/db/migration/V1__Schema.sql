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

CREATE TABLE IF NOT EXISTS player (
    player_id SERIAL PRIMARY KEY,
    username TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS team (
    team_id SERIAL PRIMARY KEY,
    player_one INT,
    player_two INT,
    FOREIGN KEY (player_one) REFERENCES player(player_id),
    FOREIGN KEY (player_two) REFERENCES player(player_id)
);

CREATE TABLE IF NOT EXISTS move (
    move_id SERIAL PRIMARY KEY,
    game INT NOT NULL,
    player INT NOT NULL,
    move_string TEXT NOT NULL,
    timestamp TIMESTAMP DEFAULT NOW(),
    FOREIGN KEY (game_id) REFERENCES game(game_id),
    FOREIGN KEY (player_id) REFERENCES player(player_id)
);