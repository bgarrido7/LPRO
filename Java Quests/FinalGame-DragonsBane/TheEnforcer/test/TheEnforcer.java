package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dkeep.logic.*;

class TheEnforcer{
	
	private Game jogo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception{
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception{
	}

	@BeforeEach
	void setUp() throws Exception{
		jogo = new Game(1);
		
		setMyMaze(jogo, 4, 5, 8, 8, 8, 1);
	}


	@AfterEach
	void tearDown() throws Exception{
	}

	@Test
	void testMoveHeroToFreeCell(){
		setMyMaze(jogo, 4, 5, 8, 8, 8, 1);

		Hero.moveHero('a', jogo);
		assertEquals(4, jogo.heroX()+1);
		assertEquals(5, jogo.heroY());
		assertEquals(3, jogo.heroX());
		assertEquals(5, jogo.heroY());	
		assertEquals(0, jogo.getMaze(jogo.heroX()+1, jogo.heroY()));
		assertEquals(3, jogo.getMaze(jogo.heroX(), jogo.heroY()));
		
		setMyMaze(jogo, 4, 5, 8, 8, 8, 1);
		
		Hero.moveHero('s', jogo);
		assertEquals(4, jogo.heroX());
		assertEquals(5, jogo.heroY()-1);
		assertEquals(4, jogo.heroX());
		assertEquals(6, jogo.heroY());
		assertEquals(0, jogo.getMaze(jogo.heroX(), jogo.heroY()-1));
		assertEquals(3, jogo.getMaze(jogo.heroX(), jogo.heroY()));
		
		setMyMaze(jogo, 4, 5, 8, 8, 8, 1);
		
		Hero.moveHero('d', jogo);
		assertEquals(4, jogo.heroX()-1);
		assertEquals(5, jogo.heroY());
		assertEquals(5, jogo.heroX());
		assertEquals(5, jogo.heroY());
		assertEquals(0, jogo.getMaze(jogo.heroX()-1, jogo.heroY()));
		assertEquals(3, jogo.getMaze(jogo.heroX(), jogo.heroY()));
		
		setMyMaze(jogo, 4, 5, 8, 8, 8, 1);
		
		Hero.moveHero('w', jogo);
		assertEquals(4, jogo.heroX());
		assertEquals(5, jogo.heroY()+1);
		assertEquals(4, jogo.heroX());
		assertEquals(4, jogo.heroY());
		assertEquals(0, jogo.getMaze(jogo.heroX(), jogo.heroY()+1));
		assertEquals(3, jogo.getMaze(jogo.heroX(), jogo.heroY()));
		
	}

	@Test
	void testMoveHeroToWall(){
		setMyMaze(jogo, 1, 1, 8, 8, 8, 1);
		
		Hero.moveHero('w', jogo);
		Game.checkLogic(jogo, ' ');
		assertEquals(1, jogo.heroX());
		assertEquals(1, jogo.heroY());
		assertEquals(3, jogo.getMaze(jogo.heroX(), jogo.heroY()));

		setMyMaze(jogo, 1, 8, 8, 8, 8, 1);

		Hero.moveHero('a', jogo);
		Game.checkLogic(jogo, ' ');
		assertEquals(1, jogo.heroX());
		assertEquals(8, jogo.heroY());
		
		Hero.moveHero('s', jogo);		
		Game.checkLogic(jogo, ' ');
		assertEquals(1, jogo.heroX());
		assertEquals(8, jogo.heroY());
		
		Hero.moveHero('d', jogo);
		Game.checkLogic(jogo, ' ');
		assertEquals(1, jogo.heroX());
		assertEquals(8, jogo.heroY());
		assertEquals(3, jogo.getMaze(jogo.heroX(), jogo.heroY()));

	}

	@Test
	void testMoveHeroToSword(){
		setMyMaze(jogo, 7, 1, 8, 8, 8, 1);

		assertEquals(false, jogo.heroArmed());
		Hero.moveHero('d', jogo);
		Game.checkLogic(jogo, ' ');
		assertEquals(true, jogo.heroArmed());
		
	}

	@Test
	void testHeroUnarmedToDragonAwake(){
		setMyMaze(jogo, 6, 8, 8, 8, 8, 1);
		
		assertEquals(false, jogo.heroArmed());
		assertEquals(true, jogo.heroAlive());
		assertEquals(false, jogo.gameOver());
		
		jogo.setSleepDragon(0, 1);
		Hero.moveHero('d', jogo);
		Dragon.moveDragon(0, jogo);
		Game.checkLogic(jogo, 'd');

		assertEquals(false, jogo.heroAlive());
		assertEquals(true, jogo.dragonAlive(0));
		assertEquals(true, jogo.gameOver());
		
	}
	
	@Test
	void testHeroArmedToDragonAwake(){
		
		do {
		setMyMaze(jogo, 6, 8, 8, 8, 8, 1);
		jogo.heroArmed(true);

		assertEquals(true, jogo.heroArmed());
		assertEquals(true, jogo.heroAlive());
		assertEquals(true, jogo.dragonAlive(0));
		assertEquals(false, jogo.gameOver());
		
		Hero.moveHero('d', jogo);
		Game.checkLogic(jogo, 'd');
		
		}while(jogo.dragonX(0)!=8 || jogo.dragonY(0)!=8);
		
		assertEquals(8, jogo.keyX());
		assertEquals(8, jogo.keyY());
		assertEquals(4, jogo.getMaze(8, 8));

		assertEquals(true, jogo.heroAlive());
		assertEquals(false, jogo.dragonAlive(0));
		assertEquals(false, jogo.gameOver());
	}
	
	@Test
	void testHeroWithKeyToExit(){
		setMyMaze(jogo, 8, 5, 8, 8, 8, 1);
		
		jogo.heroGotKey(true);
		
		assertEquals(true, jogo.heroGotKey());
		assertEquals(2, jogo.getMaze(9, 5));
		
		Game.checkLogic(jogo, 'd');
		Hero.moveHero('d', jogo);
		Game.checkLogic(jogo, 'd');
		
		assertEquals(3, jogo.getMaze(9, 5));
		
		assertEquals(true, jogo.heroAlive());
		assertEquals(true, jogo.gameOver());
		
	}
	
	@Test
	void testHeroWithoutSwordToExit(){
		setMyMaze(jogo, 8, 5, 8, 8, 8, 1);
		
		jogo.heroArmed(false);
		jogo.heroGotKey(false);
		
		assertEquals(false, jogo.heroArmed());
		assertEquals(2, jogo.getMaze(9, 5));
		
		Game.checkLogic(jogo, 'd');
		Hero.moveHero('d', jogo);
		Game.checkLogic(jogo, 'd');
		
		assertEquals(2, jogo.getMaze(9, 5));
		
		assertEquals(true, jogo.heroAlive());
		assertEquals(false, jogo.gameOver());
		
	}
	
	@Test
	void testHeroWithoutSlayDragonToExit(){
		setMyMaze(jogo, 8, 5, 8, 8, 8, 1);
		
		jogo.dragonAlive(0, true);
		jogo.heroGotKey(false);
		
		assertEquals(true, jogo.dragonAlive(0));
		assertEquals(2, jogo.getMaze(9, 5));
		
		Game.checkLogic(jogo, 'd');
		Hero.moveHero('d', jogo);
		Game.checkLogic(jogo, 'd');
		
		assertEquals(2, jogo.getMaze(9, 5));
		
		assertEquals(true, jogo.heroAlive());
		assertEquals(false, jogo.gameOver());
		
	}
	
	@Test
	void testHeroUnarmedToDragonSleeping(){
		setMyMaze(jogo, 6, 8, 8, 8, 8, 1);
		jogo.setSleepDragon(0, 1);

		jogo.heroArmed(false);
		
		assertEquals(false, jogo.dragonAwake(0));
		assertEquals(false, jogo.heroArmed());
		
		Hero.moveHero('d', jogo);
		Game.checkLogic(jogo, 'd');

		assertEquals(true, jogo.heroAlive());
		assertEquals(false, jogo.dragonAwake(0));
		assertEquals(true, jogo.dragonAlive(0));
		assertEquals(false, jogo.gameOver());
		
	}
	
	@Test
	void testHeroArmedToDragonSleeping(){
		setMyMaze(jogo, 6, 8, 8, 8, 8, 1);
		jogo.setSleepDragon(0, 1);

		jogo.heroArmed(true);
		
		assertEquals(false, jogo.dragonAwake(0));
		assertEquals(true, jogo.heroArmed());
		
		Hero.moveHero('d', jogo);
		Game.checkLogic(jogo, 'd');

		assertEquals(true, jogo.heroAlive());
		assertEquals(false, jogo.dragonAwake(0));
		assertEquals(false, jogo.dragonAlive(0));
		assertEquals(false, jogo.gameOver());
		
	}
	
	@Test
	void testTeleportation(){
		setMyMaze(jogo, 1, 1, 8, 8);
		
		assertEquals(1, jogo.dragonX(0));
		assertEquals(1, jogo.dragonY(0));
		assertEquals(5, jogo.getMaze(1, 1));
		assertEquals(0, jogo.getMaze(8, 8));
		
		Dragon.teleportDragon(0, jogo);
		
		assertEquals(8, jogo.dragonX(0));
		assertEquals(8, jogo.dragonY(0));
		assertEquals(5, jogo.getMaze(8, 8));
		assertEquals(0, jogo.getMaze(1, 1));
		
	}
	
	private void setMyMaze(Game jogo, int hx, int hy, int dx, int dy, int sx, int sy){
		
		jogo.setMaze(jogo.heroX(), jogo.heroY(), 0);
		jogo.setMaze(jogo.dragonX(0), jogo.dragonY(0), 0);
		jogo.setMaze(jogo.swordX(), jogo.swordY(), 0);
		
		jogo.heroX(hx);
		jogo.heroY(hy);
		jogo.setMaze(jogo.heroX(), jogo.heroY(), 3);

		jogo.dragonX(0, dx);
		jogo.dragonY(0, dy);
		jogo.setMaze(jogo.dragonX(0), jogo.dragonY(0), 5);
			
		jogo.swordX(sx);
		jogo.swordY(sy);
		jogo.setMaze(jogo.swordX(), jogo.swordY(), 7);
		
	}
	
	private void setMyMaze(Game jogo, int dx, int dy, int fsx, int fsy){
		int i, j;
		for(i=0;i<10;i++)
			for(j=0;j<10;j++)
				jogo.setMaze(i, j, 1);
		
		jogo.dragonX(0, dx);
		jogo.dragonY(0, dy);
		jogo.setMaze(dx, dy, 5);
		jogo.setMaze(fsx, fsy, 0);

	}

}
