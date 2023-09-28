CREATE TABLE IF NOT EXISTS team (
    team_id SERIAL PRIMARY KEY,
    player_one INT,
    player_two INT,
    FOREIGN KEY (player_one) REFERENCES player(player_id),
    FOREIGN KEY (player_two) REFERENCES player(player_id)
);