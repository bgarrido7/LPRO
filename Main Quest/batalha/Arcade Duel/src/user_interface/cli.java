package user_interface;

import java.util.ArrayList;

import game_logic.Ability;
import game_logic.Character;
import game_logic.Deck;
import game_logic.Game;
import game_logic.User;

public class cli {
	public static void main(String args[]) {

		final char common = 'C', uncommon = 'U', rare = 'R', legendary = 'E';
		
		//-----List of Abilities-----
		Ability dodge = new Ability("Dodge", "Blue", "Dodges the enemy attack", 0, 8, null);		
		Ability miss = new Ability("Miss", "Red", "Misses the attack", 0, 4, null);
		Ability thunder_shock = new Ability("Thunder Shock", "White", "Description", 40, 48, null);
		Ability thunderbolt = new Ability("Thunderbolt", "White", "Description", 100, 24, null);
		Ability poison_powder = new Ability("Poison Powder", "Purple", "The Battle opponent becomes poisoned", 1, 24, null);
		Ability seed_bomb = new Ability("Seed Bomb", "White", "", 50, 20, null);
		Ability sleep_powder = new Ability("Sleep Powder", "Purple", "The Battle opponent falls asleep", 1, 24, null);
		Ability bubble = new Ability("Bubble", "White", "", 30, 44, null);
		Ability withdraw = new Ability("Withdraw", "Blue", "", 0, 40, null);
		Ability fire_spin = new Ability("Fire Spin", "White", "", 120, 56, null);
		Ability dragon_tail = new Ability("Dragon Tail", "White", "", 100, 28, null);
		Ability psybeam = new Ability("Psybeam", "White", "", 70, 32, null);
		Ability startling_powder = new Ability("Startling Powder", "Purple", "", 1, 36, null);
		Ability ice_beam = new Ability("Ice Beam", "White", "The battle opponent is now frozen", 50, 12, null);
		Ability surf = new Ability("Surf", "White", "", 100, 36, null);
		Ability sing = new Ability("Sing", "Purple", "The battle opponent falls asleep", 1, 36, null);
		Ability barrage = new Ability("Barrage", "White", "", 1, 70, null);
		Ability stun_spore = new Ability("Stun Spore", "Purple", "The battle opponent becomes paralyzed", 1, 28, null);
		Ability flamethrower = new Ability("Flamethrower", "White", "", 40, 44, null);
		Ability focus_energy = new Ability("Focus Energy", "White", "", 0, 20, null);
		Ability tri_attack = new Ability("Tri Attack", "White", "", 80, 72, null);
		Ability horn_drill = new Ability("Horn Drill", "Purple", "The battle opponent is knocked out", 1, 28, null);
		Ability stomp = new Ability("Stomp", "White", "", 60, 48, null);
		Ability extreme_speed = new Ability("Extreme Speed", "Gold", "", 120, 40, null);
		Ability flare_blitz = new Ability("Flare Blitz", "White", "The battle opponent becomes burned", 80, 24, null);
		Ability searing_shot = new Ability("Searing Shot", "Purple", "The battle opponent becomes burned", 2, 20, null);
		Ability sightseeing = new Ability("Sightseeing", "Purple", "This character jumps over the battle opponent", 1, 28, null);
		//---------------------------
		
		//-----List of Movesets------
		ArrayList<Ability> pikachu_moveset = new ArrayList<Ability>();
		ArrayList<Ability> bulbasaur_moveset = new ArrayList<Ability>();
		ArrayList<Ability> squirtle_moveset = new ArrayList<Ability>();
		ArrayList<Ability> charizard_moveset = new ArrayList<Ability>();
		ArrayList<Ability> butterfree_moveset = new ArrayList<Ability>();
		ArrayList<Ability> lapras_moveset = new ArrayList<Ability>();
		ArrayList<Ability> flareon_moveset = new ArrayList<Ability>();
		ArrayList<Ability> rhydon_moveset = new ArrayList<Ability>();
		ArrayList<Ability> dragonite_moveset = new ArrayList<Ability>();
		ArrayList<Ability> exeggutor_moveset = new ArrayList<Ability>();
		ArrayList<Ability> arcanine_moveset = new ArrayList<Ability>();
		ArrayList<Ability> magneton_moveset = new ArrayList<Ability>();
		
		//Pikachu
		pikachu_moveset.add(thunder_shock);
		pikachu_moveset.add(thunderbolt);
		pikachu_moveset.add(miss);
		pikachu_moveset.add(dodge);
		
		//Bulbasaur
		bulbasaur_moveset.add(poison_powder);
		bulbasaur_moveset.add(seed_bomb);
		bulbasaur_moveset.add(sleep_powder);
		bulbasaur_moveset.add(miss);
		
		//Squirtle
		squirtle_moveset.add(bubble);
		squirtle_moveset.add(withdraw);
		squirtle_moveset.add(miss);

		//Charizard
		charizard_moveset.add(fire_spin);
		charizard_moveset.add(dragon_tail);
		charizard_moveset.add(miss);

		//Butterfree
		butterfree_moveset.add(psybeam);
		butterfree_moveset.add(startling_powder);
		butterfree_moveset.add(miss);

		//Lapras
		lapras_moveset.add(ice_beam);
		lapras_moveset.add(surf);
		lapras_moveset.add(sing);
		lapras_moveset.add(miss);
		lapras_moveset.add(dodge);
		
		//Flareon
		flareon_moveset.add(flamethrower);		
		flareon_moveset.add(focus_energy);
		flareon_moveset.add(miss);
		flareon_moveset.add(dodge);
		
		//Rhydon
		rhydon_moveset.add(horn_drill);
		rhydon_moveset.add(stomp);
		rhydon_moveset.add(miss);

		//Dragonite
		dragonite_moveset.add(extreme_speed);
		dragonite_moveset.add(sightseeing);
		dragonite_moveset.add(dragon_tail);
		dragonite_moveset.add(miss);
		
		//Exeggutor
		exeggutor_moveset.add(barrage);
		exeggutor_moveset.add(stun_spore);
		exeggutor_moveset.add(miss);
		
		//Arcanine
		arcanine_moveset.add(searing_shot);
		arcanine_moveset.add(extreme_speed);
		arcanine_moveset.add(flare_blitz);
		arcanine_moveset.add(miss);

		//Magneton
		magneton_moveset.add(tri_attack);
		magneton_moveset.add(miss);
		magneton_moveset.add(dodge);
		//---------------------------
		
		//-----List of Characters-----
		Character pikachu = new Character("Pikachu", rare, 3, 2, pikachu_moveset,false);
		Character charizard = new Character("Charizard", legendary, 1, 1, charizard_moveset, true);
		Character bulbasaur = new Character("Bulbasaur", rare, 3, 2, bulbasaur_moveset, false);
		Character squirtle = new Character("Squirtle", rare, 3, 2, squirtle_moveset, false);
		Character butterfree = new Character("Butterfree", rare, 2, 2, butterfree_moveset, true);
		Character lapras = new Character("Lapras", uncommon, 2, 0, lapras_moveset, true);
			
		Character flareon = new Character("Flareon", rare, 3, 2, flareon_moveset, false);
		Character rhydon = new Character("Rhydon", legendary, 2, 1, rhydon_moveset, false);
		Character arcanine = new Character("Arcanine", legendary, 1, 1, arcanine_moveset, false);
		Character exeggutor = new Character("Exeggutor", rare, 2, 2, exeggutor_moveset, false);
		Character dragonite = new Character("Dragonite", legendary, 1, 1, dragonite_moveset, true);
		Character magneton = new Character("Magneton", rare, 2, 2, magneton_moveset, false);
		//---------------------------
		System.out.println("=================================");
		System.out.println("========= ARCADE DUEL ===========");
		System.out.println("=================================");
		System.out.println();

		ArrayList<Character> charList1 = new ArrayList<Character>();
		ArrayList<Character> charList2 = new ArrayList<Character>();
		Deck d1 = new Deck(100, charList1);
		Deck d2 = new Deck(100, charList2);
		User u1 = new User("User1", "Ash", "password1", d1);
		User u2 = new User("User2", "Gary", "password2", d2);
		Game g = new Game(u1,u2);
		g.battle(u1,pikachu,u2,lapras);
		
	}
	
	public static void printMap() {
		int width = 7, height = 5;
		for(int i = 0; i < height; i++) {
			for(int j = 0; j <width; j++) {
				if((j == 1 && ((i == 1) || (i == 2) || (i == 3))) || 
				   (j == 5 && ((i == 1) || (i == 2) || (i == 3))) || 
				   ((j == 3) && (i == 2))) {
					System.out.print("  ");
				}
				else {
					System.out.print("O ");
				}
			}
			System.out.println();
		}
	}
	
}
