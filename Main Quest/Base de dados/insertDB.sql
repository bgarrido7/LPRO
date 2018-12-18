INSERT INTO users(username,pass)
VALUES ('johnny','jd123');
INSERT INTO users(username,pass)
VALUES ('penny','pbody');

INSERT INTO userProfile(firstName,lastName,league,coins,maxCharacters,totalDuels,
	totalWins,bestWinStreak,highestRank,currentRank) 
VALUES ('John','Doe','Master',23411,40,50,20,7,3920,3000);
INSERT INTO userProfile(firstName,lastName,league,coins,maxCharacters,totalDuels,
	totalWins,bestWinStreak,highestRank,currentRank) 
VALUES ('Penelopy','Saint','Trainer',8265,40,30,20,3,3000,2201);

INSERT INTO allCharacters(figureName,rarity,steps,reviveCount,canMoveOverCharacter) 
VALUES ('squirtle', 'C',3,0,false);
INSERT INTO allCharacters(figureName,rarity,steps,reviveCount,canMoveOverCharacter) 
VALUES ('charmander', 'C',3,0,false);
INSERT INTO allCharacters(figureName,rarity,steps,reviveCount,canMoveOverCharacter) 
VALUES ('pinsir', 'R',2,0,false);
INSERT INTO allCharacters(figureName,rarity,steps,reviveCount,canMoveOverCharacter) 
VALUES ('bulbasaur', 'C',3,0,false);


INSERT INTO ability(abilityName,damage,probability,colour,effect) 
VALUES ('water gun', 30, 0.60,'w',NULL);
INSERT INTO ability(abilityName,damage,probability,colour,effect) 
VALUES ('tackle', 0, 0.35,'w',NULL);
INSERT INTO ability(abilityName,damage,probability,colour,effect) 
VALUES ('smokescreen', 0, 0.10,'p','wait');

insert into shop(price)
VALUES (100);

--insert into ownedCharacters( figureName, rarity,	steps, reviveCount,	canMoveOverCharacter)
--select  figureName, rarity,	steps, reviveCount,	canMoveOverCharacter from allCharacters; 		
INSERT INTO ownedCharacters(lvl,xp) VALUES (1, 300) ;
INSERT INTO ownedCharacters(lvl,xp) VALUES (2, 520) ;
INSERT INTO ownedCharacters(lvl,xp) VALUES (1, 234) ;


--INSERT INTO offlineInventory(igureName, rarity,	steps, reviveCount,	canMoveOverCharacter)
--SELECT figureName, rarity, steps, reviveCount, canMoveOverCharacter
--FROM allCharacters
--WHERE rarity ='C' --common
	--OR rarity ='U' --uncommon
	--OR rarity ='R'; --rare

	




