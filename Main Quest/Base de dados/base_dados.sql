CREATE TABLE users(
	userID SERIAL PRIMARY KEY,
	username VARCHAR NOT NULL UNIQUE,
	pass VARCHAR NOT NULL
);

CREATE TABLE userProfile(
	userID SERIAL REFERENCES users(userID),
	firstName VARCHAR NOT NULL,
	lastName VARCHAR NOT NULL,
	league VARCHAR NOT NULL,
	coins INTEGER,
	maxCharacters INTEGER,
	totalDuels INTEGER,
	totalWins INTEGER,
	CONSTRAINT wins_lower_than_duels CHECK (totalWins <= totalDuels),
	bestWinStreak INTEGER,
	CONSTRAINT best_win_lower_than_total_wins CHECK (bestWinStreak <= totalWins),
	highestRank INTEGER,
	currentRank INTEGER,
	CONSTRAINT current_rank_lower_than_highest_rank CHECK (currentRank <= highestRank)
);

CREATE TABLE deck(
	userID SERIAL REFERENCES users(userID),
	figure1 VARCHAR,	
	figure2 VARCHAR, 
	figure3 VARCHAR, 
	figure4 VARCHAR, 
	figure5 VARCHAR, 
	figure6 VARCHAR 
);

CREATE TABLE allCharacters(
	figureID SERIAL PRIMARY KEY,
	figureName VARCHAR NOT NULL  NOT NULL,
	rarity CHAR NOT NULL,
	steps INTEGER NOT NULL,
	reviveCount INTEGER NOT NULL,
	canMoveOverCharacter BOOLEAN NOT NULL
);

CREATE TABLE ability(
	abilityName VARCHAR PRIMARY KEY, 
	damage INTEGER NOT NULL,
	probability NUMERIC(3,2) NOT NULL,
	colour CHAR NOT NULL,
	effect VARCHAR
);

CREATE TABLE characterAbilities(
	abilityName VARCHAR REFERENCES ability(abilityName)  NOT NULL, 
	figureID SERIAL REFERENCES allCharacters(figureID)  NOT NULL
);

CREATE TABLE shop(
	figureID SERIAL REFERENCES allCharacters(figureID)  NOT NULL,
	price INTEGER NOT NULL
);

-- repete-se muitas figuras por utilizador, arranjar melhor estratégia 
CREATE TABLE ownedCharacters(
	userID SERIAL REFERENCES users(userID),
	figureID SERIAL REFERENCES allCharacters(figureID)  NOT NULL,
	lvl INTEGER,
	xp INTEGER
);

CREATE TABLE offlineInventory(
	figureID SERIAL REFERENCES allCharacters(figureID)  NOT NULL,
	figureName VARCHAR NOT NULL  NOT NULL
);
--é preciso criar colunas com o mm nome de allCharacters?


	
	