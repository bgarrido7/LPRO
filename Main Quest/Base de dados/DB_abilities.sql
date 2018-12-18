//------List of Effects------
        Effect wait = new Effect("Wait", "The character can't move until the 'Wait' counter goes down", 2);
        Effect bench = new Effect("Bench", "Move the character to the bench", 2);
        Effect self_wait = new Effect("Self Wait", "The character can't move until the 'Wait' counter goes down", 2);
        Effect curse = new Effect("Curse", "If a character is knocked out while under the 'curse' effect, the character is removed from the duel", 2);
        Effect burn = new Effect("Burn", "The character opponent falls asleep", 2);
        Effect frozen = new Effect("Frozen", "The character becomes frozen and all attacks become 'miss'", 2);
        Effect confuse = new Effect("Confuse", "Instead of attacking with the selected move, the character uses the next attack in the moveset", 2);
        Effect sleep = new Effect("Sleep", "The character falls asleep, imobilizing it until an adjacent friendly character taps the sleeping character", 2);
        Effect paralysis = new Effect("Paralysis", "The smallest segment of your moveset becomes a 'miss'", 2);
        Effect poison = new Effect("Poison", "Attack damage is reduced by 20 points", 2);
        Effect noxious = new Effect("Noxious", "Attack damage is reduced by 40 points", 2);
        Effect knock_back = new Effect("Knock Back", "The battle opponent is knocked back 1 step and gains wait", 2);
        Effect self_knock_back = new Effect("Self Knock Back", "The character moves 1 step back", 2);
        Effect knock_out = new Effect("Knock Out","The character is knocked out", 2);
        Effect self_knock_out = new Effect("Self Knock Out","The character is knocked out", 2);    
        Effect move_distance_reduction_by_1 = new Effect("Move Distance Reduction By 1","The character move distance is reduced by 1", 2);
        Effect move_distance_reduction_by_2 = new Effect("Move Distance Reduction By 2","The character move distance is reduced by 2", 2);
        Effect swap = new Effect("Swap", "Switch this character with the battle opponent", 2);
        Effect random = new Effect("Random", "Applies a random effect", 2);
        //---------------------------
 
        //-----List of Abilities-----
        Ability annihilate = new Ability("Annihilate", "Blue", "The battle opponent moves to the bench and gains 'Wait'", 0, 8, bench);
        Ability air_cutter = new Ability("Air Cutter", "White", "Description", 40, 12, null);
        Ability aqua_jet = new Ability("Aqua Jet", "Gold", "Description", 30, 20, null);
        Ability aqua_tail = new Ability("Aqua Tail", "White", "The battle opponent now has 'Wait'", 30, 24, wait);
        Ability astonish = new Ability("Astonish", "White", "Description", 20, 48, null);
        Ability barrage = new Ability("Barrage", "White", "Description", 70, 32, null);
        Ability big_yawn = new Ability("Big Yawn", "Purple", "This character and the battle opponent fall asleep", 1, 36, sleep);
        Ability bind = new Ability("Bind", "White", "Description", 10, 60, wait);
        Ability bite = new Ability("Bite", "White", "Description", 60, 24, null);
        Ability body_slam = new Ability("Body Slam", "White", "Description", 110, 32, null);
        Ability bubble = new Ability("Bubble", "White", "Description", 20, 24, null);
        Ability cold_crush = new Ability("Cold Crush", "White", "Description", 90, 32, null);
        Ability confuse_ray = new Ability("Confuse Ray", "Purple", "The battle opponent becomes confused", 3, 28, confuse);
        Ability confusion = new Ability("Confusion", "White", "Description", 20, 28, null);
        Ability constrict = new Ability("Constrict", "Purple", "The battle opponent now has 'Wait'", 2, 24, wait);
        Ability contagious_terror = new Ability("Contagious Terror", "Purple", "The battle opponent now has 'Wait'", 2, 32, wait);
        Ability crunch = new Ability("Crunch", "White", "Description", 28, 70, null);
        Ability crushing_flames = new Ability("Crushing Flames", "White", "Description", 130, 32, null);
        Ability defense_curl = new Ability("Defense Curl", "White", "Description", 0, 24, null);
        Ability destiny_bond = new Ability("Destiny Bond", "White", "Description", 0, 28, knock_out);
        Ability dig = new Ability("Dig", "Purple", "Description", 2, 40, null);
        Ability disable = new Ability("Disable", "Purple", "The battle opponent now has 'Wait'", 2, 28, wait);
        Ability dodge = new Ability("Dodge", "Blue", "Dodges the opponent attack", 0, 8, null);
        Ability double_slap = new Ability("Double Slap", "White", "Description", 40, 36, null);
        Ability dragon_rage = new Ability("Dragon Rage", "White", "Description", 80, 12, null);
        Ability dragon_tail = new Ability("Dragon Tail", "White", "Description", 80, 28, null);
        Ability dynamic_punch = new Ability("Dynamic Punch", "White", "Description", 100, 36, null);
        Ability eerie_light = new Ability("Eerie Light", "Purple", "The battle opponent becomes confused", 1, 32, confuse);
        Ability explosion = new Ability("Explosion", "Purple", "This character and all neighbor characters are knocked out", 2, 32, knock_out);
        Ability extreme_speed = new Ability("Extreme Speed", "Gold", "Description", 120, 43, null);
        Ability fake_out = new Ability("Fake Out", "Purple", "This character switches with its battle opponent", 3, 32, null);
        Ability faint_attack = new Ability("Faint Attack", "White", "Description", 40, 20, null);
        Ability false_swipe = new Ability("False Swipe", "White", "Description", 20, 24, null);
        Ability fire_punch = new Ability("Fire Punch", "White", "The battle opponent becomes burned", 50, 52, burn);
        Ability fire_spin = new Ability("Fire Spin", "White", "Description", 50, 56, null);
        Ability flail = new Ability("Flail", "White", "Desription", 10, 44, null);
        Ability flame = new Ability("Flame", "Purple", "The battle opponent becomes burned", 2, 24, burn);
        Ability flamethrower = new Ability("Flamethrower", "White", "", 40, 44, null);
        Ability flame_charge = new Ability("Flame Charge", "Purple", "The battle opponent becomes burned", 2, 20, burn);
        Ability flame_tail = new Ability("Flame Tail", "White", "Description", 40, 24, null);
        Ability flame_wheel = new Ability("Flame Wheel", "White", "The battle opponent becomes burned", 50, 52, burn);
        Ability flare_blitz = new Ability("Flare Blitz", "White", "The battle opponent becomes burned", 80, 24, burn);
        Ability fly_away = new Ability("Fly Away", "Purple", "This character jumps over the battle opponent and lands on a surrounding point", 3, 44, null);
        Ability focus_energy = new Ability("Focus Energy", "White", "Description", 0, 28, null);
        Ability focus_punch = new Ability("Focus Punch", "White", "Description", 40, 56, null);
        Ability fury_attack = new Ability("Fury Attack", "White", "Description", 20, 48, null);
        Ability glare = new Ability("Glare", "Purple", "The battle opponent becomes paralyzed", 2, 32, paralysis);
        Ability guillotine = new Ability("Guillotine", "Purple", "The battle opponent is knocked out", 1, 20, knock_out);
        Ability hard_shell = new Ability("Hard Shell", "White", "Description", 50, 20, move_distance_reduction_by_2);
        Ability harden = new Ability("Harden", "White", "Description", 0, 68, null);
        Ability horn_attack = new Ability("Horn Attack", "White", "Description", 70, 16, null);
        Ability horn_drill = new Ability("Horn Drill", "Purple", "The battle opponent is knocked out", 1, 28, knock_out);
        Ability hydro_pump = new Ability("Hydro Pump", "White", "Description", 100, 40, null);
        Ability hyper_beam = new Ability("Hyper Beam", "White", "Description", 100, 52, null);
        Ability hyper_fang = new Ability("Hyper Fang", "White", "Description", 70, 28, null);
        Ability hyper_sonic = new Ability("Hyper Sonic", "Gold", "Description", 30, 48, null);
        Ability hyper_take_down = new Ability("Hyper Take Down", "White", "Description", 90, 24, null);
        Ability hyper_voice = new Ability("Hyper Voice", "White", "Description", 70, 12, null);
        Ability hypnosis = new Ability("Hypnosis", "Purple", "The battle opponent falls asleep", 2, 28, sleep);
        Ability ice_beam = new Ability("Ice Beam", "White", "The battle opponent is now frozen", 50, 12, null);
        Ability ice_charge = new Ability("Ice Charge", "Purple", "The battle opponent becomes frozen", 2, 20, frozen);
        Ability iron_tail = new Ability("Iron Tail", "White", "Description", 50, 56, null);
        Ability karate_chop = new Ability("Karate Chop", "White", "Description", 60, 24, null);
        Ability kick_away = new Ability("Kick Away", "Purple", "The battle opponent is knocked back 2 steps", 1, 28, knock_back);
        Ability landslide = new Ability("Landslide", "Purple", "The battle opponent now has 'Wait'", 1, 40, wait);
        Ability leech_life = new Ability("Leech Life", "White", "Description", 20, 32, null);
        Ability lullaby = new Ability("Lullaby", "Purple", "The battle opponent falls asleep", 1, 36, sleep);
        Ability magnetic_storm = new Ability("Magnetic Storm", "Purple", "The battle opponent becomes paralyzed", 2, 32, paralysis);
        Ability megahorn = new Ability("Megahorn", "White", "Description", 80, 28, null);
        Ability mirror_coat = new Ability("Mirror Coat", "Purple", "The battle opponent is knocked out if they spin purple", 2, 40, knock_out);
        Ability miss = new Ability("Miss", "Red", "Description", 0, 4, null);
        Ability mud_shot = new Ability("Mud Shot", "White", "The battle opponent has his move distance reduced by 1", 40, 40, move_distance_reduction_by_1);
        Ability mysterious_wall = new Ability("Mysterious Wall", "Purple", "The battle opponent becomes confused", 3, 28, confuse);
        Ability night_shade = new Ability("Night Shade", "White", "Description", 100, 40, null);
        Ability peck = new Ability("Peck", "White", "Description", 40, 16, null);
        Ability poison_fang = new Ability("Poison Fang", "White", "Description", 50, 28, poison);
        Ability poison_gas = new Ability("Poison Gas", "Purple", "The battle opponent becomes poisoned", 1, 28, poison);
        Ability poison_kick = new Ability("Poison Kick", "White", "Description", 40, 28, poison);
        Ability poison_powder = new Ability("Poison Powder", "Purple", "The battle opponent becomes poisoned", 1, 24, poison);
        Ability poison_sting = new Ability("Poison Sting", "Purple", "The battle opponent becomes poisoned", 1, 60, poison);
        Ability pound = new Ability("Pound", "White", "Description", 70, 24, null);
        Ability protect = new Ability("Protect", "Blue", "Description", 0, 8, self_wait);
        Ability psybeam = new Ability("Psybeam", "White", "Description", 70, 32, confuse);
        Ability psychic = new Ability("Psychic", "White", "Description", 70, 28, null);
        Ability psychic_shove = new Ability("Psychic Shove", "Purple", "Description", 2, 32, knock_back);
        Ability push_aside = new Ability("Push Aside", "Purple", "The battle opponent moves to the bench and gains wait", 2, 20, bench);
        Ability quick_attack = new Ability("Quick Attack", "Gold", "Description", 30, 24, null);
        Ability rapid_spin = new Ability("Rapid Spin", "White", "Description", 20, 36, null);
        Ability razor_leaf = new Ability("Razor Leaf", "White", "Description", 60, 24, null);
        Ability rock_blast = new Ability("Rock Blast", "White", "Description", 60, 40, null);
        Ability rock_slide = new Ability("Rock Slide", "White", "Description", 80, 56, null);
        Ability rock_throw = new Ability("Rock Throw", "White", "Description", 40, 24, null);
        Ability rockwall = new Ability("Rockwall", "White", "Description", 30, 24, null);
        Ability rollout = new Ability("Rollout", "White", "Description", 30, 40, null);
        Ability roost = new Ability("Roost", "Blue", "Description", 0, 16, wait);
        Ability round = new Ability("Round", "White", "Decription", 20, 24, null);
        Ability scissor_toss = new Ability("Scissor Toss", "Purple", "The battle opponent is knocked back 1 step and gains wait", 1, 28, knock_back);
        Ability scratch = new Ability("Scratch", "White", "Description", 10, 32, null);
        Ability searing_shot = new Ability("Searing Shot", "Purple", "The battle opponent becomes burned", 2, 20, burn);
        Ability seed_bomb = new Ability("Seed Bomb", "White", "Description", 50, 20, null);
        Ability self_destruct = new Ability("Self-Destruct", "Purple", "Both characters are knocked out", 3, 24, self_knock_out);
        Ability shock_blast = new Ability("Shock Blast", "White", "Description", 30, 32, null);
        Ability shuttle_flip = new Ability("Shuttle Flip", "Blue", "This character moves 1 step back", 2, 32, self_knock_back);
        Ability sightseeing = new Ability("Sightseeing", "Purple", "This character jumps over the battle opponent", 1, 28, null);
        Ability sing = new Ability("Sing", "Purple", "The battle opponent falls asleep", 1, 32, sleep);
        Ability slash = new Ability("Slash", "White", "Description", 40, 52, null);
        Ability sleep_powder = new Ability("Sleep Powder", "Purple", "The battle opponent falls asleep", 1, 28, sleep);
        Ability sleepwalk = new Ability("Sleepwalk", "Purple", "The battle opponent falls asleep", 2, 28, sleep);
        Ability sludge_bomb = new Ability("Sludge Bomb", "White", "The battle opponent becomes poisoned", 30, 40, poison);
        Ability smog = new Ability("Smog", "Purple", "The battle opponent becomes poisoned", 1, 44, poison);
        Ability smokescreen = new Ability("Smokescreen", "Purple", "The battle opponent now has 'Wait'", 1, 28, wait);
        Ability solar_beam = new Ability("Solar Beam", "White", "Description", 130, 32, null);
        Ability spark = new Ability("Spark", "White", "Description", 20, 40, null);
        Ability spit_poison = new Ability("Spit Poison", "Poison", "The battle opponent becomes poisoned", 2, 28, poison);
        Ability splash = new Ability("Splash", "White", "Description", 0, 48, null);
        Ability startling_powder = new Ability("Startling Powder", "Purple", "Description", 50, 20, random);
        Ability steel_wing = new Ability("Steel Wing", "White", "Description", 50, 16, null);
        Ability stomp = new Ability("Stomp", "White", "Description", 40, 28, null);
        Ability storm = new Ability("Storm", "Purple", "The battle opponent is moved to the bench", 1, 28, bench);
        Ability string_wrap = new Ability("String Wrap", "Purple", "Description", 1, 52, move_distance_reduction_by_1);
        Ability stun_spore = new Ability("Stun Spore", "Purple", "The battle opponent becomes paralyzed", 1, 28, paralysis);
        Ability submission = new Ability("Submission", "White", "Description", 80, 28, null);
        Ability super_psy = new Ability("Super Psy", "White", "Description", 40, 32, confuse);
        Ability supersonic = new Ability("Supersonic", "Purple", "The battle opponent becomes confused", 2, 32, confuse);
        Ability surf = new Ability("Surf", "White", "", 100, 36, null);
        Ability sweet_scent = new Ability("Sweet Scent", "Purple", "One character within 3 steps' range is drawn 1 step closer to this character", 1, 32, wait);
        Ability tackle = new Ability("Tackle", "White", "Description", 10, 32, null);
        Ability tail_snap = new Ability("Tail Snap", "White", "Description", 30, 52, null);
        Ability take_down = new Ability("Take Down", "White", "Description", 80, 24, null);
        Ability tease = new Ability("Tease", "Purple", "Switch this character with the battle opponent", 1, 28, swap);
        Ability tentacle_barrage = new Ability("Tentacle Barrage", "White", "Description", 40, 52, poison);
        Ability tentacle_sting = new Ability("Tentacle Sting", "White", "Description", 80, 56, random);
        Ability thrash = new Ability("Thrash", "White", "This character becomes confused", 50, 28, confuse);
        Ability thunder = new Ability("Thunder", "White", "Description", 100, 12, null);
        Ability thunderbolt = new Ability("Thunderbolt", "White", "Description", 100, 24, null);
        Ability thunder_charge = new Ability("Thunder Charge", "Purple", "The battle opponent becomes paralyzed", 2, 20, paralysis);
        Ability thunder_crash = new Ability("Thunder Crash", "Gold", "Description", 100, 32, null);
        Ability thunder_jolt = new Ability("Thunder Jolt", "White", "Description", 40, 52, paralysis);
        Ability thunder_punch = new Ability("Thunder Punch", "White", "The battle opponent becomes paralyzed", 50, 32, paralysis);
        Ability thunder_shock = new Ability("Thunder Shock", "White", "Description", 30, 40, null);
        Ability thunder_wave = new Ability("Thunder Wave", "Purple", "Description", 2, 20, paralysis);
        Ability tri_attack = new Ability("Tri Attack", "White", "", 80, 72, random);
        Ability twineedle = new Ability("Twineedle", "White", "Description", 40, 44, poison);
        Ability vice_grip = new Ability("Vice Grip", "White", "Description", 40, 32, null);
        Ability vine_whip = new Ability("Vine Whip", "White", "Description", 40, 28, null);
        Ability waterfall = new Ability("Waterfall", "White", "Description", 40, 56, null);
        Ability water_gun = new Ability("Water Gun", "White", "Description", 40, 40, null);
        Ability water_pulse = new Ability("Water Pulse", "White", "Description", 60, 24, null);
        Ability water_slide = new Ability("Water Slide", "Purple", "The battle opponent is knocked back by 1", 1, 28, knock_back);
        Ability withdraw = new Ability("Withdraw", "Blue", "This pokemons gains 'Wait'", 0, 40, wait);
        Ability wrap = new Ability("Wrap", "White", "Description", 20, 48, null);
        //---------------------------
       
        //-----List of Movesets------
        ArrayList<Ability> bulbasaur_moveset = new ArrayList<Ability>();
        ArrayList<Ability> ivysaur_moveset = new ArrayList<Ability>();
        ArrayList<Ability> venusaur_moveset = new ArrayList<Ability>();
        ArrayList<Ability> charmander_moveset = new ArrayList<Ability>();
        ArrayList<Ability> charmeleon_moveset = new ArrayList<Ability>();
        ArrayList<Ability> charizard_moveset = new ArrayList<Ability>();
        ArrayList<Ability> squirtle_moveset = new ArrayList<Ability>();
        ArrayList<Ability> wartortle_moveset = new ArrayList<Ability>();
        ArrayList<Ability> blastoise_moveset = new ArrayList<Ability>();
        ArrayList<Ability> caterpie_moveset = new ArrayList<Ability>();
        ArrayList<Ability> metapod_moveset = new ArrayList<Ability>();
        ArrayList<Ability> butterfree_moveset = new ArrayList<Ability>();
        ArrayList<Ability> weedle_moveset = new ArrayList<Ability>();
        ArrayList<Ability> kakuna_moveset = new ArrayList<Ability>();
        ArrayList<Ability> beedrill_moveset = new ArrayList<Ability>();
        ArrayList<Ability> pidgey_moveset = new ArrayList<Ability>();
        ArrayList<Ability> pidgeotto_moveset = new ArrayList<Ability>();
        ArrayList<Ability> pidgeot_moveset = new ArrayList<Ability>();
        ArrayList<Ability> rattata_moveset = new ArrayList<Ability>();
        ArrayList<Ability> raticate_moveset = new ArrayList<Ability>();
        ArrayList<Ability> spearow_moveset = new ArrayList<Ability>();
        ArrayList<Ability> fearow_moveset = new ArrayList<Ability>();
        ArrayList<Ability> ekans_moveset = new ArrayList<Ability>();
        ArrayList<Ability> arbok_moveset = new ArrayList<Ability>();
        ArrayList<Ability> pikachu_moveset = new ArrayList<Ability>();
        ArrayList<Ability> raichu_moveset = new ArrayList<Ability>();
        ArrayList<Ability> sandshrew_moveset = new ArrayList<Ability>();
        ArrayList<Ability> sandslash_moveset = new ArrayList<Ability>();
        ArrayList<Ability> nidoran_female_moveset = new ArrayList<Ability>();
        ArrayList<Ability> nidorina_moveset = new ArrayList<Ability>();
        ArrayList<Ability> nidoqueen_moveset = new ArrayList<Ability>();
        ArrayList<Ability> nidoran_male_moveset = new ArrayList<Ability>();
        ArrayList<Ability> nidorino_moveset = new ArrayList<Ability>();
        ArrayList<Ability> nidoking_moveset = new ArrayList<Ability>();
        ArrayList<Ability> clefairy_moveset = new ArrayList<Ability>();
        ArrayList<Ability> clefable_moveset = new ArrayList<Ability>();
        ArrayList<Ability> vulpix_moveset = new ArrayList<Ability>();
        ArrayList<Ability> ninetales_moveset = new ArrayList<Ability>();
        ArrayList<Ability> jigglypuff_moveset = new ArrayList<Ability>();
        ArrayList<Ability> wigglytuff_moveset = new ArrayList<Ability>();
        ArrayList<Ability> zubat_moveset = new ArrayList<Ability>();
        ArrayList<Ability> golbat_moveset = new ArrayList<Ability>();
        ArrayList<Ability> oddish_moveset = new ArrayList<Ability>();
        ArrayList<Ability> gloom_moveset = new ArrayList<Ability>();
        ArrayList<Ability> vileplume_moveset = new ArrayList<Ability>();
        ArrayList<Ability> paras_moveset = new ArrayList<Ability>();
        ArrayList<Ability> parasect_moveset = new ArrayList<Ability>();
        ArrayList<Ability> venonat_moveset = new ArrayList<Ability>();
        ArrayList<Ability> venomoth_moveset = new ArrayList<Ability>();
        ArrayList<Ability> diglett_moveset = new ArrayList<Ability>();
        ArrayList<Ability> dugtrio_moveset = new ArrayList<Ability>();
        ArrayList<Ability> meowth_moveset = new ArrayList<Ability>();
        ArrayList<Ability> persian_moveset = new ArrayList<Ability>();
        ArrayList<Ability> psyduck_moveset = new ArrayList<Ability>();
        ArrayList<Ability> golduck_moveset = new ArrayList<Ability>();
        ArrayList<Ability> mankey_moveset = new ArrayList<Ability>();
        ArrayList<Ability> primeape_moveset = new ArrayList<Ability>();
        ArrayList<Ability> growlithe_moveset = new ArrayList<Ability>();
        ArrayList<Ability> arcanine_moveset = new ArrayList<Ability>();
        ArrayList<Ability> poliwag_moveset = new ArrayList<Ability>();
        ArrayList<Ability> poliwhirl_moveset = new ArrayList<Ability>();
        ArrayList<Ability> poliwrath_moveset = new ArrayList<Ability>();
        ArrayList<Ability> abra_moveset = new ArrayList<Ability>();
        ArrayList<Ability> kadabra_moveset = new ArrayList<Ability>();
        ArrayList<Ability> alakazam_moveset = new ArrayList<Ability>();
        ArrayList<Ability> machop_moveset = new ArrayList<Ability>();
        ArrayList<Ability> machoke_moveset = new ArrayList<Ability>();
        ArrayList<Ability> machamp_moveset = new ArrayList<Ability>();
        ArrayList<Ability> bellsprout_moveset = new ArrayList<Ability>();
        ArrayList<Ability> weepinbell_moveset = new ArrayList<Ability>();
        ArrayList<Ability> victreebel_moveset = new ArrayList<Ability>();
        ArrayList<Ability> tentacool_moveset = new ArrayList<Ability>();
        ArrayList<Ability> tentacruel_moveset = new ArrayList<Ability>();
        ArrayList<Ability> geodude_moveset = new ArrayList<Ability>();
        ArrayList<Ability> graveler_moveset = new ArrayList<Ability>();
        ArrayList<Ability> golem_moveset = new ArrayList<Ability>();
        ArrayList<Ability> ponyta_moveset = new ArrayList<Ability>();
        ArrayList<Ability> rapidash_moveset = new ArrayList<Ability>();
        ArrayList<Ability> slowpoke_moveset = new ArrayList<Ability>();
        ArrayList<Ability> slowbro_moveset = new ArrayList<Ability>();
        ArrayList<Ability> magnemite_moveset = new ArrayList<Ability>();
        ArrayList<Ability> magneton_moveset = new ArrayList<Ability>();
        ArrayList<Ability> farfetchd_moveset = new ArrayList<Ability>();
        ArrayList<Ability> doduo_moveset = new ArrayList<Ability>();
        ArrayList<Ability> dodrio_moveset = new ArrayList<Ability>();
        ArrayList<Ability> seel_moveset = new ArrayList<Ability>();
        ArrayList<Ability> dewgong_moveset = new ArrayList<Ability>();
        ArrayList<Ability> grimer_moveset = new ArrayList<Ability>();
        ArrayList<Ability> muk_moveset = new ArrayList<Ability>();
        ArrayList<Ability> shellder_moveset = new ArrayList<Ability>();
        ArrayList<Ability> cloyster_moveset = new ArrayList<Ability>();
        ArrayList<Ability> gastly_moveset = new ArrayList<Ability>();
        ArrayList<Ability> haunter_moveset = new ArrayList<Ability>();
        ArrayList<Ability> gengar_moveset = new ArrayList<Ability>();
        ArrayList<Ability> onix_moveset = new ArrayList<Ability>();
        ArrayList<Ability> drowzee_moveset = new ArrayList<Ability>();
        ArrayList<Ability> hypno_moveset = new ArrayList<Ability>();
        ArrayList<Ability> krabby_moveset = new ArrayList<Ability>();
        ArrayList<Ability> kingler_moveset = new ArrayList<Ability>();
        ArrayList<Ability> voltorb_moveset = new ArrayList<Ability>();
        ArrayList<Ability> electrode_moveset = new ArrayList<Ability>();
        ArrayList<Ability> exeggcute_moveset = new ArrayList<Ability>();
        ArrayList<Ability> exeggutor_moveset = new ArrayList<Ability>();
        ArrayList<Ability> cubone_moveset = new ArrayList<Ability>();
        ArrayList<Ability> marowak_moveset = new ArrayList<Ability>();
        ArrayList<Ability> hitmonlee_moveset = new ArrayList<Ability>();
        ArrayList<Ability> hitmonchan_moveset = new ArrayList<Ability>();
        ArrayList<Ability> lickytung_moveset = new ArrayList<Ability>();
        ArrayList<Ability> koffing_moveset = new ArrayList<Ability>();
        ArrayList<Ability> weezing_moveset = new ArrayList<Ability>();
        ArrayList<Ability> rhyhorn_moveset = new ArrayList<Ability>();
        ArrayList<Ability> rhydon_moveset = new ArrayList<Ability>();
        ArrayList<Ability> chansey_moveset = new ArrayList<Ability>();
        ArrayList<Ability> tangela_moveset = new ArrayList<Ability>();
        ArrayList<Ability> kangaskhan_moveset = new ArrayList<Ability>();
        ArrayList<Ability> horsea_moveset = new ArrayList<Ability>();
        ArrayList<Ability> seadra_moveset = new ArrayList<Ability>();
        ArrayList<Ability> goldeen_moveset = new ArrayList<Ability>();
        ArrayList<Ability> seaking_moveset = new ArrayList<Ability>();
        ArrayList<Ability> staryu_moveset = new ArrayList<Ability>();
        ArrayList<Ability> starmie_moveset = new ArrayList<Ability>();
        ArrayList<Ability> mrmime_moveset = new ArrayList<Ability>();
        ArrayList<Ability> scyther_moveset = new ArrayList<Ability>();
        ArrayList<Ability> jynx_moveset = new ArrayList<Ability>();
        ArrayList<Ability> electabuzz_moveset = new ArrayList<Ability>();
        ArrayList<Ability> magmar_moveset = new ArrayList<Ability>();
        ArrayList<Ability> pinsir_moveset = new ArrayList<Ability>();
        ArrayList<Ability> tauros_moveset = new ArrayList<Ability>();
        ArrayList<Ability> magikarp_moveset = new ArrayList<Ability>();
        ArrayList<Ability> gyarados_moveset = new ArrayList<Ability>();
        ArrayList<Ability> lapras_moveset = new ArrayList<Ability>();
        ArrayList<Ability> ditto_moveset = new ArrayList<Ability>();
        ArrayList<Ability> eevee_moveset = new ArrayList<Ability>();
        ArrayList<Ability> vaporeon_moveset = new ArrayList<Ability>();
        ArrayList<Ability> jolteon_moveset = new ArrayList<Ability>();
        ArrayList<Ability> flareon_moveset = new ArrayList<Ability>();
        ArrayList<Ability> porygon_moveset = new ArrayList<Ability>();
        ArrayList<Ability> omanyte_moveset = new ArrayList<Ability>();
        ArrayList<Ability> omastar_moveset = new ArrayList<Ability>();
        ArrayList<Ability> kabuto_moveset = new ArrayList<Ability>();
        ArrayList<Ability> kabutops_moveset = new ArrayList<Ability>();
        ArrayList<Ability> aerodactyl_moveset = new ArrayList<Ability>();
        ArrayList<Ability> snorlax_moveset = new ArrayList<Ability>();
        ArrayList<Ability> articuno_moveset = new ArrayList<Ability>();
        ArrayList<Ability> zapdos_moveset = new ArrayList<Ability>();
        ArrayList<Ability> moltres_moveset = new ArrayList<Ability>();
        ArrayList<Ability> dratini_moveset = new ArrayList<Ability>();
        ArrayList<Ability> dragonair_moveset = new ArrayList<Ability>();
        ArrayList<Ability> dragonite_moveset = new ArrayList<Ability>();
        ArrayList<Ability> mewtwo_moveset = new ArrayList<Ability>();
        ArrayList<Ability> mew_moveset = new ArrayList<Ability>();
        //---------------------------
 
        //-----List of Characters-----
        Character bulbasaur = new Character("Bulbasaur", 'U', 3, 4, bulbasaur_moveset, false);
        Character ivysaur = new Character("Ivysaur", 'C', 2, 5, ivysaur_moveset, false);
        Character venusaur = new Character("Venusaur", 'E', 1, 2, venusaur_moveset, false);
        Character charmander = new Character("Charmander", 'U', 3, 4, charmander_moveset, false);
        Character charmeleon = new Character("Charmeleon", 'C', 2, 5, charmeleon_moveset, false);
        Character charizard = new Character("Charizard", 'E', 1, 2, charizard_moveset, false);
        Character squirtle = new Character("Squirtle", 'U', 3, 4, squirtle_moveset, false);
        Character wartortle = new Character("Wartortle", 'C', 2, 5, wartortle_moveset, false);
        Character blastoise = new Character("Blastoise", 'E', 2, 2, blastoise_moveset, false);
        Character caterpie = new Character("Caterpie", 'U', 1, 4, caterpie_moveset, false);
        Character metapod = new Character("Metapod", 'U', 1, 4, metapod_moveset, false);
        Character butterfree = new Character("Butterfree", 'U', 2, 4, butterfree_moveset, false);
        Character weedle = new Character("Weedle", 'C', 1, 5, weedle_moveset, false);
        Character kakuna = new Character("Kakuna", 'U', 1, 4, kakuna_moveset, false);
        Character beedrill = new Character("Beedrill", 'C', 3, 5, beedrill_moveset, false);
        Character pidgey = new Character("Pidgey", 'C', 2, 5, pidgey_moveset, true);
        Character pidgeotto = new Character("Pidgeotto", 'U', 2, 4, pidgeotto_moveset, true);
        Character pidgeot = new Character("Pidgeot", 'R', 2, 3, pidgeot_moveset, true);
        Character rattata = new Character("Rattata", 'C', 2, 5, rattata_moveset, false);
        Character raticate = new Character("Raticate", 'C', 2, 5, raticate_moveset, false);
        Character spearow = new Character("Spearow", 'C', 2, 5, spearow_moveset, false);
        Character fearow = new Character("Fearow", 'U', 2, 4, fearow_moveset, true);
        Character ekans = new Character("Ekans", 'C', 3, 5, ekans_moveset, false);
        Character arbok = new Character("Arbok", 'U', 2, 4, arbok_moveset, false);
        Character pikachu = new Character("Pikachu", 'U', 2, 4, pikachu_moveset, false);
        Character raichu = new Character("Raichu", 'U', 2, 4, raichu_moveset, false);
        Character sandshrew = new Character("Sandshrew", 'C', 2, 5, sandshrew_moveset, false);
        Character sandslash = new Character("Sandslash", 'U', 2, 4, sandslash_moveset, false);
        Character nidoran_female = new Character("Nidoran(F)", 'C', 2, 5, nidoran_female_moveset, false);
        Character nidorina = new Character("Nidorina", 'U', 2, 4, nidorina_moveset, false);
        Character nidoqueen = new Character("Nidoqueen", 'R', 1, 3, nidoqueen_moveset, false);
        Character nidoran_male = new Character("Nidoran(M)", 'C', 2, 5, nidoran_male_moveset, false);
        Character nidorino = new Character("Nidorino", 'U', 2, 4, nidorino_moveset, false);
        Character nidoking = new Character("Nidoking", 'R', 1, 3, nidoking_moveset, false);
        Character clefairy = new Character("Clefairy", 'C', 2, 5, clefairy_moveset, false);
        Character clefable = new Character("Clefable", 'U', 2, 4, clefable_moveset, false);
        Character vulpix = new Character("Vulpix", 'U', 3, 4, vulpix_moveset, false);
        Character ninetales = new Character("Ninetales", 'R', 2, 3, ninetales_moveset, false);
        Character jigglypuff = new Character("Jigglypuff", 'R', 2, 3, jigglypuff_moveset, false);
        Character wigglytuff = new Character("Wigglytuff", 'R', 2, 3, wigglytuff_moveset, false);
        Character zubat = new Character("Zubat", 'C', 2, 5, zubat_moveset, false);
        Character golbat = new Character("Golbat", 'U', 2, 4, golbat_moveset, false);
        Character oddish = new Character("Oddish", 'C', 2, 5, oddish_moveset, false);
        Character gloom = new Character("Gloom", 'U', 2, 4, gloom_moveset, false);
        Character vileplume = new Character("Vileplume", 'R', 2, 3, vileplume_moveset, false);
        Character paras = new Character("Paras", 'C', 2, 5, paras_moveset, false);
        Character parasect = new Character("Parasect", 'U', 2, 4, parasect_moveset, false);
        Character venonat = new Character("Venonat", 'C', 2, 5, venonat_moveset, false);
        Character venomoth = new Character("Venomoth", 'U', 3, 4, venomoth_moveset, false);
        Character diglett = new Character("Diglett", 'U', 2, 4, diglett_moveset, false);
        Character dugtrio = new Character("Dugtrio", 'R', 2, 3, dugtrio_moveset, false);
        Character meowth = new Character("Meowth", 'R', 2, 3, meowth_moveset, false);
        Character persian = new Character("Persian", 'R', 2, 3, persian_moveset, false);
        Character psyduck = new Character("Psyduck", 'U', 2, 4, psyduck_moveset, false);
        Character golduck = new Character("Golduck", 'R', 2, 3, golduck_moveset, false);
        Character mankey = new Character("Mankey", 'C', 3, 5, mankey_moveset, false);
        Character primeape = new Character("Primeape", 'U', 3, 4, primeape_moveset, false);
        Character growlithe = new Character("Growlithe", 'R', 3, 3, growlithe_moveset, false);
        Character arcanine = new Character("Arcanine", 'E', 2, 2, arcanine_moveset, false);
        Character poliwag = new Character("Poliwag", 'C', 3, 5, poliwag_moveset, false);
        Character poliwhirl = new Character("Poliwhirl", 'U', 2, 4, poliwhirl_moveset, false);
        Character poliwrath = new Character("Poliwrath", 'R', 2, 3, poliwrath_moveset, false);
        Character abra = new Character("Abra", 'R', 3, 3, abra_moveset, false);
        Character kadabra = new Character("Kadabra", 'R', 3, 3, kadabra_moveset, false);
        Character alakazam = new Character("Alakazam", 'E', 2, 2, alakazam_moveset, false);
        Character machop = new Character("Machop", 'C', 2, 5, machop_moveset, false);
        Character machoke = new Character("Machoke", 'U', 2, 4, machoke_moveset, false);
        Character machamp = new Character("Machamp", 'R', 2, 3, machamp_moveset, false);
        Character bellsprout = new Character("Bellsprout", 'U', 2, 4, bellsprout_moveset, false);
        Character weepinbell = new Character("Weepinbell", 'U', 2, 4, weepinbell_moveset, false);
        Character victreebel = new Character("Victreebel", 'R', 2, 3, victreebel_moveset, false);
        Character tentacool = new Character("Tentacool", 'U', 2, 4, tentacool_moveset, false);
        Character tentacruel = new Character("Tentacruel", 'R', 1, 3, tentacruel_moveset, false);
        Character geodude = new Character("Geodude", 'C', 2, 5, geodude_moveset, false);
        Character graveler = new Character("Graveler", 'C', 1, 5, graveler_moveset, false);
        Character golem = new Character("Golem", 'U', 1, 4, golem_moveset, false);
        Character ponyta = new Character("Ponyta", 'U', 3, 4, ponyta_moveset, false);
        Character rapidash = new Character("Rapidash", 'R', 3, 3, rapidash_moveset, false);
        Character slowpoke = new Character("Slowpoke", 'U', 1, 4, slowpoke_moveset, false);
        Character slowbro = new Character("Slowbro", 'R', 1, 3, slowbro_moveset, false);
        Character magnemite = new Character("Magnemite", 'C', 3, 5, magnemite_moveset, false);
        Character magneton = new Character("Magneton", 'R', 2, 3, magneton_moveset, false);
        Character farfetchd = new Character("Farfetch'd", 'R', 2, 3, farfetchd_moveset, false);
        Character doduo = new Character("Doduo", 'C', 3, 5, doduo_moveset, false);
        Character dodrio = new Character("Dodrio", 'U', 3, 4, dodrio_moveset, false);
        Character seel = new Character("Seel", 'C', 2, 5, seel_moveset, false);
        Character dewgong = new Character("Dewgong", 'U', 2, 4, dewgong_moveset, false);
        Character grimer = new Character("Grimer", 'R', 1, 3, grimer_moveset, false);
        Character muk = new Character("Muk", 'R', 1, 3, muk_moveset, false);
        Character shellder = new Character("Shellder", 'U', 2, 4, shellder_moveset, false);
        Character cloyster = new Character("Cloyster", 'R', 2, 3, cloyster_moveset, false);
        Character gastly = new Character("Gastly", 'R', 3, 3, gastly_moveset, true);
        Character haunter = new Character("Haunter", 'U', 2, 4, haunter_moveset, true);
        Character gengar = new Character("Gengar", 'E', 2, 2, gengar_moveset, true);
        Character onix = new Character("Onix", 'R', 1, 3, onix_moveset, false);
        Character drowzee = new Character("Drowzee", 'C', 1, 5, drowzee_moveset, false);
        Character hypno = new Character("Hypno", 'R', 2, 3, hypno_moveset, false);
        Character krabby = new Character("Krabby", 'C', 2, 5, krabby_moveset, false);
        Character kingler = new Character("Kingler", 'U', 2, 4, kingler_moveset, false);
        Character voltorb = new Character("Voltorb", 'U', 3, 4, voltorb_moveset, false);
        Character electrode = new Character("Electrode", 'R', 3, 3, electrode_moveset, false);
        Character exeggcute = new Character("Exeggcute", 'C', 2, 5, exeggcute_moveset, false);
        Character exeggutor = new Character("Exeggutor", 'U', 1, 4, exeggutor_moveset, false);
        Character cubone = new Character("Cubone", 'U', 2, 4, cubone_moveset, false);
        Character marowak = new Character("Marowak", 'R', 2, 3, marowak_moveset, false);
        Character hitmonlee = new Character("Hitmonlee", 'R', 3, 3, hitmonlee_moveset, false);
        Character hitmonchan = new Character("Hitmonchan", 'R', 3, 3, hitmonchan_moveset, false);
        Character lickytung = new Character("Lickytung", 'R', 1, 3, lickytung_moveset, false);
        Character koffing = new Character("Koffing", 'C', 1, 5, koffing_moveset, false);
        Character weezing = new Character("Weezing", 'U', 2, 4, weezing_moveset, false);
        Character rhyhorn = new Character("Rhyhorn", 'C', 1, 5, rhyhorn_moveset, false);
        Character rhydon = new Character("Rhydon", 'U', 1, 4, rhydon_moveset, false);
        Character chansey = new Character("Chansey", 'R', 1, 3, chansey_moveset, false);
        Character tangela = new Character("Tangela", 'U', 2, 4, tangela_moveset, false);
        Character kangaskhan = new Character("Kangaskhan", 'R', 1, 3, kangaskhan_moveset, false);
        Character horsea = new Character("Horsea", 'C', 2, 5, horsea_moveset, false);
        Character seadra = new Character("Seadra", 'U', 3, 4, seadra_moveset, false);
        Character goldeen = new Character("Goldeen", 'U', 2, 4, goldeen_moveset, false);
        Character seaking = new Character("Seaking", 'U', 2, 4, seaking_moveset, false);
        Character staryu = new Character("Staryu", 'C', 2, 5, staryu_moveset, false);
        Character starmie = new Character("Starmie", 'U', 2, 4, starmie_moveset, false);
        Character mrmime = new Character("Mr. Mime", 'R', 2, 3, mrmime_moveset, false);
        Character scyther = new Character("Scyther", 'U', 2, 4, scyther_moveset, false);
        Character jynx = new Character("Jynx", 'R', 2, 3, jynx_moveset, false);
        Character electabuzz = new Character("Electabuzz", 'R', 2, 3,electabuzz_moveset, false);
        Character magmar = new Character("Magmar", 'R', 2, 3, magmar_moveset, false);
        Character pinsir = new Character("Pinsir", 'R', 2, 3, pinsir_moveset, false);
        Character tauros = new Character("Tauros", 'R', 3, 3, tauros_moveset, false);
        Character magikarp = new Character("Magikarp", 'C', 2, 5, magikarp_moveset, false);
        Character gyarados = new Character("Gyarados", 'R', 1, 3, gyarados_moveset, false);
        Character lapras = new Character("Lapras", 'R', 2, 3, lapras_moveset, false);
        Character ditto = new Character("Ditto", 'R', 1, 3, ditto_moveset, false);
        Character eevee = new Character("Eevee", 'R', 3, 3, eevee_moveset, false);
        Character vaporeon = new Character("Vaporeon", 'R', 3, 3, vaporeon_moveset, false);
        Character jolteon = new Character("Jolteon", 'R', 3, 3, jolteon_moveset, false);
        Character flareon = new Character("Flareon", 'R', 3, 3, flareon_moveset, false);
        Character porygon = new Character("Porygon", 'R', 2, 3, porygon_moveset, false);
        Character omanyte = new Character("Omanyte", 'U', 2, 4, omanyte_moveset, false);
        Character omastar = new Character("Omastar", 'R', 2, 3, omastar_moveset, false);
        Character kabuto = new Character("Kabuto", 'U', 2, 4, kabuto_moveset, false);
        Character kabutops = new Character("Kabutops", 'R', 2, 3, kabutops_moveset, false);
        Character aerodactyl = new Character("Aerodactyl", 'R', 3, 3, aerodactyl_moveset, true);
        Character snorlax = new Character("Snorlax", 'E', 1, 2, snorlax_moveset, false);
        Character articuno = new Character("Articuno", 'E', 2, 2, articuno_moveset, true);
        Character zapdos = new Character("Zapdos", 'E', 2, 2, zapdos_moveset, true);
        Character moltres = new Character("Moltres", 'E', 2, 2, moltres_moveset, true);
        Character dratini = new Character("Dratini", 'R', 2, 3, dratini_moveset, false);
        Character dragonair = new Character("Dragonair", 'R', 2, 3, dragonair_moveset, false);
        Character dragonite = new Character("Dragonite", 'E', 1, 2, dragonite_moveset, false);
        Character mewtwo = new Character("Mewtwo", 'E', 2, 2, mewtwo_moveset, false);
        Character mew = new Character("Mew", 'E', 3, 2, mew_moveset, false);
        //---------------------------
 
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
       
        //Ivysaur
        ivysaur_moveset.add(vine_whip);
        ivysaur_moveset.add(razor_leaf);
        ivysaur_moveset.add(sleep_powder);
        ivysaur_moveset.add(miss);
 
        //Venusaur
        venusaur_moveset.add(vine_whip);
        venusaur_moveset.add(solar_beam);
        venusaur_moveset.add(sleep_powder);
        venusaur_moveset.add(miss);
       
        //Charmander
        charmander_moveset.add(flame_tail);
        charmander_moveset.add(smokescreen);
        charmander_moveset.add(scratch);
        charmander_moveset.add(miss);
 
        //Charmeleon
        charmeleon_moveset.add(flame);
        charmeleon_moveset.add(iron_tail);
        charmeleon_moveset.add(miss);
       
        //Charizard
        charizard_moveset.add(fire_spin);
        charizard_moveset.add(dragon_tail);
        charizard_moveset.add(miss);
       
        //Squirtle
        squirtle_moveset.add(bubble);
        squirtle_moveset.add(withdraw);
        squirtle_moveset.add(miss);
 
        //Wartortle
        wartortle_moveset.add(water_gun);
        wartortle_moveset.add(rapid_spin);
        wartortle_moveset.add(dodge);
        wartortle_moveset.add(miss);
 
        //Blastoise
        blastoise_moveset.add(hydro_pump);
        blastoise_moveset.add(mirror_coat);
        blastoise_moveset.add(miss);
 
        //Caterpie
        caterpie_moveset.add(string_wrap);
        caterpie_moveset.add(tackle);
        caterpie_moveset.add(miss);
 
        //Metapod
        metapod_moveset.add(harden);
        metapod_moveset.add(tackle);
        metapod_moveset.add(miss);
       
        //Butterfree
        butterfree_moveset.add(psybeam);       
        butterfree_moveset.add(startling_powder);
        butterfree_moveset.add(miss);
 
        //Weedle
        weedle_moveset.add(tackle);
        weedle_moveset.add(poison_sting);
        weedle_moveset.add(miss);
 
        //Kakuna
        kakuna_moveset.add(hard_shell);
        kakuna_moveset.add(poison_sting);
        kakuna_moveset.add(miss);
 
        //Beedrill
        beedrill_moveset.add(twineedle);
        beedrill_moveset.add(miss);
 
        //Pidgey
        pidgey_moveset.add(miss);
       
        //Pidgeotto
        pidgeotto_moveset.add(miss);
       
        //Pidgeot
        pidgeot_moveset.add(miss);
       
        //Rattata
        rattata_moveset.add(quick_attack);
        rattata_moveset.add(tackle);
        rattata_moveset.add(miss);
 
        //Raticate
        raticate_moveset.add(hyper_fang);      
        raticate_moveset.add(tackle);
        raticate_moveset.add(miss);
 
        //Spearow
        spearow_moveset.add(peck);
        spearow_moveset.add(fly_away);
        spearow_moveset.add(miss);
 
        //Fearow
        fearow_moveset.add(miss);
       
        //Ekans
        ekans_moveset.add(wrap);
        ekans_moveset.add(spit_poison);
        ekans_moveset.add(miss);
 
        //Arbok
        arbok_moveset.add(poison_fang);
        arbok_moveset.add(glare);
        arbok_moveset.add(dodge);
        arbok_moveset.add(miss);
 
        //Pikachu
         pikachu_moveset.add(thunder_shock);
         pikachu_moveset.add(thunderbolt);
         pikachu_moveset.add(dodge);
         pikachu_moveset.add(miss);
 
        //Raichu
        raichu_moveset.add(thunder);
        raichu_moveset.add(thunder_jolt);
        raichu_moveset.add(miss);
 
        //Sandshrew
        sandshrew_moveset.add(slash);
        sandshrew_moveset.add(scratch);
        sandshrew_moveset.add(defense_curl);   
        sandshrew_moveset.add(miss);
 
        //Sandslash
        sandslash_moveset.add(miss);
       
        //Nidoran(F)
         nidoran_female_moveset.add(miss);
         
        //Nidorina
        nidorina_moveset.add(miss);
         
        //Nidoqueen
        nidoqueen_moveset.add(miss);
         
        //Nidoran(M)
        nidoran_male_moveset.add(poison_kick);
        nidoran_male_moveset.add(horn_attack);
        nidoran_male_moveset.add(poison_sting);
        nidoran_male_moveset.add(miss);
         
        //Nidorino
        nidorino_moveset.add(miss);
         
        //Nidoking
        nidoking_moveset.add(miss);
         
        //Clefairy
        clefairy_moveset.add(miss);
       
        //Clefable
        clefable_moveset.add(miss);
       
        //Vulpix
        vulpix_moveset.add(miss);
       
        //Ninetales
        ninetales_moveset.add(miss);
       
        //Jigglypuff
        jigglypuff_moveset.add(lullaby);
        jigglypuff_moveset.add(hyper_voice);
        jigglypuff_moveset.add(double_slap);
        jigglypuff_moveset.add(miss);
 
        //Wigglytuff
        wigglytuff_moveset.add(round);
        wigglytuff_moveset.add(sing);
        wigglytuff_moveset.add(pound);
        wigglytuff_moveset.add(miss);
 
        //Zubat
        zubat_moveset.add(leech_life);
        zubat_moveset.add(air_cutter);
        zubat_moveset.add(supersonic);
        zubat_moveset.add(miss);
       
        //Golbat
        zubat_moveset.add(leech_life);
        zubat_moveset.add(bite);
        zubat_moveset.add(confuse_ray);
        zubat_moveset.add(miss);
       
        //Oddish
        oddish_moveset.add(miss);
       
        //Gloom
        gloom_moveset.add(miss);
       
        //Vileplume
        vileplume_moveset.add(miss);
       
        //Paras
        paras_moveset.add(miss);
       
        //Parasect
        parasect_moveset.add(miss);
       
        //Venonat
        venonat_moveset.add(miss);
       
        //Venomoth
        venomoth_moveset.add(miss);
       
        //Diglett
        diglett_moveset.add(faint_attack);
        diglett_moveset.add(dig);
        diglett_moveset.add(scratch);
        diglett_moveset.add(miss);
       
        //Dugtrio
        dugtrio_moveset.add(miss);
       
        //Meowth
        meowth_moveset.add(fake_out);
        meowth_moveset.add(scratch);
        meowth_moveset.add(dodge);
        meowth_moveset.add(miss);
       
        //Persian
        persian_moveset.add(miss);
       
        //Psyduck
        psyduck_moveset.add(water_pulse);
        psyduck_moveset.add(super_psy);
        psyduck_moveset.add(disable);
        psyduck_moveset.add(miss);
       
        //Golduck
        golduck_moveset.add(miss);
       
        //Mankey
        mankey_moveset.add(scratch);
        mankey_moveset.add(thrash);
        mankey_moveset.add(tease);
        mankey_moveset.add(miss);
       
        //Primeape
        primeape_moveset.add(miss);
       
        //Growlithe
        growlithe_moveset.add(crunch);
        growlithe_moveset.add(flame_wheel);
        growlithe_moveset.add(miss);
       
        //Arcanine
        arcanine_moveset.add(searing_shot);
        arcanine_moveset.add(extreme_speed);
        arcanine_moveset.add(flare_blitz);
        arcanine_moveset.add(miss);
       
        //Poliwag
        poliwag_moveset.add(bubble);
        poliwag_moveset.add(hypnosis);
        poliwag_moveset.add(dodge);
        poliwag_moveset.add(miss);
       
        //Poliwhirl
        poliwag_moveset.add(water_gun);
        poliwag_moveset.add(hypnosis);
        poliwag_moveset.add(miss);
       
        //Poliwrath
        poliwrath_moveset.add(dynamic_punch);
        poliwrath_moveset.add(double_slap);
        poliwrath_moveset.add(miss);
       
        //Abra
        abra_moveset.add(miss);
       
        //Kadabra
        kadabra_moveset.add(miss);
       
        //Alakazam
        alakazam_moveset.add(miss);
       
        //Machop
        machop_moveset.add(focus_punch);
        machop_moveset.add(dodge);
        machop_moveset.add(miss);
       
        //Machoke
        machoke_moveset.add(miss);
       
        //Machamp
        machamp_moveset.add(karate_chop);
        machamp_moveset.add(submission);
        machamp_moveset.add(dodge);
        machamp_moveset.add(miss);
       
        //Bellsprout
        bellsprout_moveset.add(sweet_scent);   
        bellsprout_moveset.add(sleep_powder);
        bellsprout_moveset.add(vine_whip);
        bellsprout_moveset.add(miss);
       
        //Weepinbell
        weepinbell_moveset.add(miss);
       
        //Victreebel
        victreebel_moveset.add(miss);
       
        //Tentacool
        tentacool_moveset.add(tentacle_barrage);
        tentacool_moveset.add(poison_sting);
        tentacool_moveset.add(miss);
       
        //Tentacruel
        tentacruel_moveset.add(tentacle_sting);
        tentacruel_moveset.add(mirror_coat);
        tentacruel_moveset.add(miss);
       
        //Geodude
        geodude_moveset.add(self_destruct);
        geodude_moveset.add(rollout);
        geodude_moveset.add(rock_throw);
        geodude_moveset.add(miss);
       
        //Graveler
        graveler_moveset.add(rollout);
        graveler_moveset.add(landslide);
        graveler_moveset.add(miss);
 
        //Golem
        golem_moveset.add(rock_throw);
        golem_moveset.add(rock_blast);
        golem_moveset.add(rockwall);
        golem_moveset.add(miss);
       
        //Ponyta
        ponyta_moveset.add(miss);
       
        //Rapidash
        rapidash_moveset.add(miss);
       
        //Slowpoke
        slowpoke_moveset.add(miss);
       
        //Slowbro
        slowbro_moveset.add(miss);
       
        //Magnemite
        magnemite_moveset.add(thunder_wave);
        magnemite_moveset.add(spark);
        magnemite_moveset.add(dodge);
        magnemite_moveset.add(miss);
       
        //Magneton
        magneton_moveset.add(tri_attack);
        magneton_moveset.add(miss);
        magneton_moveset.add(dodge);
       
        //Farfetch'd
        farfetchd_moveset.add(miss);
       
        //Doduo
        doduo_moveset.add(peck);
        doduo_moveset.add(fury_attack);
        doduo_moveset.add(dodge);
        doduo_moveset.add(miss);
       
        //Dodrio
        dodrio_moveset.add(miss);
       
        //Seel
        seel_moveset.add(miss);
       
        //Dewgong
        dewgong_moveset.add(miss);
       
        //Grimer
        grimer_moveset.add(crunch);
        grimer_moveset.add(miss);
       
        //Muk
        muk_moveset.add(miss);
       
        //Shellder
        shellder_moveset.add(miss);
       
        //Cloyster
        cloyster_moveset.add(miss);
       
        //Gastly
        gastly_moveset.add(astonish);
        gastly_moveset.add(destiny_bond);
        gastly_moveset.add(miss);
       
        //Haunter
        haunter_moveset.add(night_shade);
        haunter_moveset.add(eerie_light);
        haunter_moveset.add(dodge);
        haunter_moveset.add(miss);
       
        //Gengar
        gengar_moveset.add(night_shade);
        gengar_moveset.add(contagious_terror);
        gengar_moveset.add(dodge);
        gengar_moveset.add(miss);
       
        //Onix
        onix_moveset.add(rock_slide);
        onix_moveset.add(dig);
        onix_moveset.add(dodge);
        onix_moveset.add(miss);
       
        //Drowzee
        drowzee_moveset.add(hypnosis);
        drowzee_moveset.add(confusion);
        drowzee_moveset.add(miss);
       
        //Hypno
        hypno_moveset.add(psychic);
        hypno_moveset.add(sleepwalk);
        hypno_moveset.add(confusion);
        hypno_moveset.add(psychic);
       
        //Krabby
        krabby_moveset.add(miss);
       
        //Kingler
        kingler_moveset.add(miss);
       
        //Voltorb
        voltorb_moveset.add(tackle);
        voltorb_moveset.add(shock_blast);
        voltorb_moveset.add(explosion);
        voltorb_moveset.add(miss);
       
        //Electrode
        electrode_moveset.add(thunder_wave);
        electrode_moveset.add(shock_blast);
        electrode_moveset.add(miss);
       
        //Exeggcute
        exeggcute_moveset.add(barrage);
        exeggcute_moveset.add(miss);
 
        //Exeggutor
        exeggutor_moveset.add(barrage);
        exeggutor_moveset.add(stun_spore);
        exeggutor_moveset.add(miss);
       
        //Cubone
        cubone_moveset.add(miss);
       
        //Marowak
        marowak_moveset.add(miss);
       
        //Hitmonlee
        hitmonlee_moveset.add(miss);
       
        //Hitmonchan
        hitmonchan_moveset.add(miss);
       
        //Lickytung
        lickytung_moveset.add(miss);
       
        //Koffing
        koffing_moveset.add(smog);
        koffing_moveset.add(sludge_bomb);
        koffing_moveset.add(miss);
       
        //Weezing
        weezing_moveset.add(sludge_bomb);
        weezing_moveset.add(poison_gas);
        weezing_moveset.add(miss);
       
        //Rhyhorn
        rhyhorn_moveset.add(hyper_take_down);
        rhyhorn_moveset.add(stomp);
        rhyhorn_moveset.add(miss);
       
        //Rhydon
        rhydon_moveset.add(horn_drill);
        rhydon_moveset.add(stomp);
        rhydon_moveset.add(miss);
       
        //Chansey
        chansey_moveset.add(miss);
       
        //Tangela
        tangela_moveset.add(bind);
        tangela_moveset.add(constrict);
        tangela_moveset.add(miss);
       
        //Kangaskhan
        kangaskhan_moveset.add(miss);
       
        //Horsea
        horsea_moveset.add(miss);
       
        //Seadra
        seadra_moveset.add(miss);
       
        //Goldeen
        goldeen_moveset.add(aqua_tail);
        goldeen_moveset.add(waterfall);
        goldeen_moveset.add(miss);
       
        //Seaking
        seaking_moveset.add(fury_attack);
        seaking_moveset.add(megahorn);
        seaking_moveset.add(dodge);
        seaking_moveset.add(miss);
       
        //Staryu
        staryu_moveset.add(miss);
       
        //Starmie
        starmie_moveset.add(miss);
       
        //Mr. Mime
        mrmime_moveset.add(mysterious_wall);
        mrmime_moveset.add(psychic);
        mrmime_moveset.add(dodge);
        mrmime_moveset.add(miss);
       
        //Scyther
        scyther_moveset.add(false_swipe);
        scyther_moveset.add(slash);
        scyther_moveset.add(miss);
       
        //Jynx
        jynx_moveset.add(miss);
       
        //Electabuzz
        electabuzz_moveset.add(thunder_punch);
        electabuzz_moveset.add(quick_attack);
        electabuzz_moveset.add(miss);
       
        //Magmar
        magmar_moveset.add(fire_punch);
        magmar_moveset.add(confuse_ray);
        magmar_moveset.add(miss);
       
        //Pinsir
        pinsir_moveset.add(vice_grip);
        pinsir_moveset.add(scissor_toss);
        pinsir_moveset.add(guillotine);
        pinsir_moveset.add(miss);
 
        //Tauros
        tauros_moveset.add(miss);
       
        //Magikarp
        magikarp_moveset.add(flail);
        magikarp_moveset.add(splash);
        magikarp_moveset.add(miss);
       
        //Gyarados
        gyarados_moveset.add(hyper_beam);
        gyarados_moveset.add(miss);
        gyarados_moveset.add(storm);
       
        //Lapras
        lapras_moveset.add(ice_beam);
        lapras_moveset.add(surf);
        lapras_moveset.add(sing);
        lapras_moveset.add(miss);
        lapras_moveset.add(dodge);
       
        //Ditto
        ditto_moveset.add(miss);
       
        //Eevee
        eevee_moveset.add(quick_attack);
        eevee_moveset.add(focus_energy);
        eevee_moveset.add(tackle);
        eevee_moveset.add(dodge);
        eevee_moveset.add(miss);
       
        //Vaporeon
        vaporeon_moveset.add(water_pulse);
        vaporeon_moveset.add(water_slide);
        vaporeon_moveset.add(dodge);
        vaporeon_moveset.add(miss);
       
        //Jolteon
        jolteon_moveset.add(thunder_jolt);
        jolteon_moveset.add(quick_attack);
        jolteon_moveset.add(dodge);
        jolteon_moveset.add(miss);
       
        //Flareon
        flareon_moveset.add(flamethrower);     
        flareon_moveset.add(focus_energy);
        flareon_moveset.add(miss);
        flareon_moveset.add(dodge);
       
        //Porygon
        porygon_moveset.add(miss);
       
        //Omanyte
        omanyte_moveset.add(miss);
       
        //Omastar
        omastar_moveset.add(miss);
       
        //Kabuto
        kabuto_moveset.add(mud_shot);
        kabuto_moveset.add(aqua_jet);
        kabuto_moveset.add(protect);
        kabuto_moveset.add(miss);
       
        //Kabutops
        kabutops_moveset.add(miss);
       
        //Aerodactyl
        aerodactyl_moveset.add(miss);
       
        //Snorlax
        snorlax_moveset.add(pound);
        snorlax_moveset.add(body_slam);
        snorlax_moveset.add(big_yawn);
        snorlax_moveset.add(miss);
       
        //Articuno
        articuno_moveset.add(ice_charge);
        articuno_moveset.add(cold_crush);
        articuno_moveset.add(steel_wing);
        articuno_moveset.add(roost);
        articuno_moveset.add(miss);
       
        //Zapdos
        zapdos_moveset.add(thunder_charge);
        zapdos_moveset.add(thunder_crash);
        zapdos_moveset.add(steel_wing);
        zapdos_moveset.add(roost);
        zapdos_moveset.add(miss);
       
        //Moltres
        moltres_moveset.add(flame_charge);
        moltres_moveset.add(crushing_flames);
        moltres_moveset.add(flame_charge);
        moltres_moveset.add(roost);
        moltres_moveset.add(miss);
       
        //Dratini
        dratini_moveset.add(tail_snap);
        dratini_moveset.add(push_aside);
        dratini_moveset.add(dragon_rage);
        dratini_moveset.add(miss);
       
        //Dragonair
        dragonair_moveset.add(dragon_tail);
        dragonair_moveset.add(magnetic_storm);
        dragonair_moveset.add(miss);
       
        //Dragonite
        dragonite_moveset.add(extreme_speed);
        dragonite_moveset.add(sightseeing);
        dragonite_moveset.add(dragon_tail);
        dragonite_moveset.add(miss);
       
        //Mewtwo
        mewtwo_moveset.add(psychic);
        mewtwo_moveset.add(psychic_shove);
        mewtwo_moveset.add(annihilate);
        mewtwo_moveset.add(miss);
       
        //Mew
        mew_moveset.add(hyper_sonic);
        mew_moveset.add(psychic);
        mew_moveset.add(shuttle_flip);
        mew_moveset.add(miss);
        //--------------------