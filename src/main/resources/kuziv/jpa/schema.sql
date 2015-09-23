DROP TABLE IF EXISTS teams;
DROP TABLE IF EXISTS players;

CREATE TABLE teams (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(40) NOT NULL,
);

CREATE TABLE players (
  id        INTEGER IDENTITY PRIMARY KEY,
  firstname VARCHAR(40),
  lastname  VARCHAR(40),
  salary    DOUBLE,
  team_id   INTEGER REFERENCES teams
);

INSERT INTO teams(name) VALUES ('Barcelona');
INSERT INTO teams(name) VALUES ('Real Madrid');
INSERT INTO teams(name) VALUES ('Chelsea');
INSERT INTO teams(name) VALUES ('Shakhtar Donetsk');

INSERT INTO players(firstname,lastname,salary,team_id) VALUES ('Neymar', 'da Silva', 7500000, 1);
INSERT INTO players(firstname,lastname,salary,team_id) VALUES ('Andres', 'Iniesta', 7000000, 1);
INSERT INTO players(firstname,lastname,salary,team_id) VALUES ('Cristiano', 'Ronaldo', 8000000, 2);
INSERT INTO players(firstname,lastname,salary,team_id) VALUES ('Karim', 'Benzema', 6500000, 2);
INSERT INTO players(firstname,lastname,salary,team_id) VALUES ('Cesc', 'Fabregas', 7000000, 3);
INSERT INTO players(firstname,lastname,salary,team_id) VALUES ('Willian', '', 6500000, 3);
INSERT INTO players(firstname,lastname,salary,team_id) VALUES ('Gladkyy', 'Oleksandr', 100000, 4);
INSERT INTO players(firstname,lastname,salary,team_id) VALUES ('Darijo', 'Srna', 1100000, 4);
