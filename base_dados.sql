CREATE TABLE users(
	userID SERIAL PRIMARY KEY,
	username VARCHAR NOT NULL UNIQUE,
	firstName VARCHAR NOT NULL,
	lastName VARCHAR NOT NULL,
	pass VARCHAR NOT NULL,
	league VARCHAR DEFAULT 'Trainer',
	coins INTEGER DEFAULT 300,
	maxCharacters INTEGER DEFAULT 15,
	totalDuels INTEGER DEFAULT 0,
	totalWins INTEGER DEFAULT 0,
	CONSTRAINT wins_lower_than_duels CHECK (totalWins <= totalDuels),
	bestWinStreak INTEGER  DEFAULT 0,
	CONSTRAINT wins_lower_than_duels CHECK (bestWinStreak <= totalWins),
	highestRank INTEGER DEFAULT 0,
	currentRank INTEGER DEFAULT 2000,
	CONSTRAINT wins_lower_than_duels CHECK (currentRank <= highestRank)
);
INSERT INTO users 
VALUES (1, 'johnny', 'John','Doe','jd123','Leader',23411,40,50,20,7,3920,3000);

--nao sei se isto vai ser preciso (também está um codigo mau)
CREATE TABLE deck(
	userID SERIAL REFERENCES users(userID),
	f1 SERIAL REFERENCES ownedCharacters(figureID) DEFAULT 1,--dá para fazer default de uma key?
	f2 SERIAL REFERENCES ownedCharacters(figureID) DEFAULT 2,
	f3 SERIAL REFERENCES ownedCharacters(figureID) DEFAULT 3,
	f4 SERIAL REFERENCES ownedCharacters(figureID) DEFAULT 4,
	f5 SERIAL REFERENCES ownedCharacters(figureID) DEFAULT 5,
	f6 SERIAL REFERENCES ownedCharacters(figureID) DEFAULT 6 
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
	probability FLOAT(3,2) NOT NULL,
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
	userID SERIAL REFERENCES users(userID)  NOT NULL, 
	figureID SERIAL REFERENCES allCharacters(figureID)  NOT NULL,
	lvl INTEGER DEFAULT 0,
	xp INTEGER PRIMARY KEY
);

CREATE TABLE offlineInventory(
	figureID SERIAL REFERENCES allCharacters(figureID)  NOT NULL
);
--é preciso criar colunas com o mm nome de allCharacters?
INSERT INTO offlineInventory
SELECT * FROM allCharacters
WHERE rarity ='C' --common
	OR rarity ='U' --uncommon
	OR rarity ='R' --rare
	

	
	
