//battle() returns 0 in case of draw, 1 if attacker wins, 2 if defender wins
    public int battle(User player1, Character attacker, User player2, Character defender) {
       
        int total_attacker = 0;
        for(int i = 0; i < attacker.getMoveset().size();i++) {
            total_attacker += attacker.moveset.get(i).getProbability();
        }
        int attacker_rand = rand.nextInt(total_attacker)+ 1;
        Ability move_attacker = null;
        int upper_limit_attacker = 0;
        for(int i = 0; i < attacker.moveset.size();i++) {
            int lower_limit_attacker = upper_limit_attacker+1;
            upper_limit_attacker += attacker.moveset.get(i).getProbability();
            if (i == 0)
            {
                if((attacker_rand >= lower_limit_attacker) && (attacker_rand <= upper_limit_attacker)) {
                    move_attacker = attacker.moveset.get(i);
                }
            }
            else {
                if((attacker_rand >= (lower_limit_attacker)) && (attacker_rand <= upper_limit_attacker)) {
                    move_attacker = attacker.moveset.get(i);
                }
            }
        }
        System.out.print(player1.getUsername() + "'s ");
        if((move_attacker.getType() == "White") || (move_attacker.getType() == "Purple") || (move_attacker.getType() == "Gold")) {
            System.out.print(attacker.getName() + " used ");
            System.out.println(move_attacker.getName() + "!");
        }
        else if(move_attacker.getType() == "Blue") {
            System.out.println(attacker.getName() + " dodged the enemy attack!");
        }
        else if(move_attacker.getType() == "Red") {
            System.out.println(attacker.getName() + " missed his attack!");
        }
   
        int total_defender = 0;
        for(int i = 0; i < defender.moveset.size();i++) {
            total_defender += defender.moveset.get(i).getProbability();
        }
        Ability move_defender = null;
        int defender_rand = rand.nextInt(total_defender)+ 1;
        int upper_limit_defender = 0;
        for(int i = 0; i < defender.moveset.size();i++) {
            int lower_limit_defender = upper_limit_defender+1;
            upper_limit_defender += defender.moveset.get(i).getProbability();
            if (i == 0)
            {
                if((defender_rand >= lower_limit_defender) && (defender_rand <= upper_limit_defender)) {
                    move_defender = defender.moveset.get(i);
                }
            }
            else {
                if((defender_rand >= lower_limit_defender) && (defender_rand <= upper_limit_defender)) {
                    move_defender = defender.moveset.get(i);
                }
            }
        }
        System.out.print(player2.getUsername() + "'s ");
        if((move_defender.getType() == "White") || (move_defender.getType() == "Purple") || (move_defender.getType() == "Gold")) {
            System.out.print(defender.getName() + " used ");
            System.out.println(move_defender.getName() + "!");
        }
        else if(move_defender.getType() == "Blue") {
            System.out.println(defender.getName() + " dodged the enemy attack!");
        }
        else if(move_defender.getType() == "Red") {
            System.out.println(defender.getName() + " missed his attack!");
        }
        System.out.println();
 
        String type_attacker = move_attacker.getType();
        int damage_attacker = move_attacker.getDamage();
       
        String type_defender = move_defender.getType();
        int damage_defender = move_defender.getDamage();
       
        if((type_attacker == "Blue") && ((type_defender == "White") ||
                                         (type_defender == "Purple") ||
                                         (type_defender == "Gold"))) {
            System.out.println(attacker.getName() + " dodged " + defender.getName() + "'s " + move_defender.getName());
            return 1;
        }
        else if((type_attacker == "Blue") && ((type_defender == "Blue") ||
                                              (type_defender == "Red"))) {
            System.out.println("It's a draw!");
            return 0;
        }
        else if((type_attacker == "Red") && ((type_defender == "White") ||
                                             (type_defender == "Purple") ||
                                             (type_defender == "Gold"))) {
            System.out.println(defender.getName() + " wins the battle!");
            return 2;
        }
        else if((type_attacker == "Red") && ((type_defender == "Red") ||
                                             (type_defender == "Blue"))) {
            System.out.println("It's a draw!");
            return 0;
        }
        else if((type_attacker == "White") && (type_defender == "Purple")) {
            System.out.println(defender.getName() + " wins the battle!");
            return 2;
        }
        else if((type_attacker == "White") && (type_defender == "Blue")) {
            System.out.println(defender.getName() + " dodged " + attacker.getName() + "'s " + move_attacker.getName());
            return 2;
        }
        else if((type_attacker == "White") && ((type_defender == "White") ||
                                               (type_defender == "Gold"))) {
            if(damage_attacker > damage_defender) {
                System.out.println(attacker.getName() + " wins the battle!");
                return 1;
            }
            else if(damage_attacker == damage_defender) {
                System.out.println("It's a draw!");
                return 0;
            }
            else {
                System.out.println(defender.getName() + " wins the battle!");
                return 2;
            }
        }
        else if((type_attacker == "White") && (type_defender == "Red")) {
            System.out.println(attacker.getName() + " wins the battle!");
            return 1;
        }
        else if((type_attacker == "Purple") && ((type_defender == "White") ||
                                                (type_defender == "Red"))) {
            System.out.println(attacker.getName() + " wins the battle!");
            return 1;
        }
        else if((type_attacker == "Purple") && (type_defender == "Blue")) {
            System.out.println(defender.getName() + " dodged " + attacker.getName() + "'s " + move_attacker.getName());
            return 2;
        }
        else if((type_attacker == "Purple") && (type_defender == "Gold")) {
        System.out.println(defender.getName() + " wins the battle!");
        return 2;
        }
        else if((type_attacker == "Purple") && ((type_defender == "Purple"))) {
            if(damage_attacker > damage_defender) {
                System.out.println(attacker.getName() + " wins the battle!");
                return 1;
            }
            else if(damage_attacker == damage_defender) {
                System.out.println("It's a draw!");
                return 0;
            }
            else {
                System.out.println(defender.getName() + " wins the battle!");
                return 2;
            }
        }
        else if((type_attacker == "Gold") && ((type_defender == "Purple") ||
                                              (type_defender == "Red"))) {
            System.out.println(attacker.getName() + " wins the battle!");
            return 1;
        }
        else if((type_attacker == "Gold") && (type_defender == "Blue")) {
            System.out.println(defender.getName() + " dodged " + attacker.getName() + "'s " + move_attacker.getName());
            return 2;
        }
        else if((type_attacker == "Gold") && ((type_defender == "Gold") ||
                                              (type_defender == "White"))) {
            if(damage_attacker > damage_defender) {
                System.out.println(attacker.getName() + " wins the battle!");
                return 1;
            }
            else if(damage_attacker == damage_defender) {
                System.out.println("It's a draw!");
                return 0;
            }
            else {
                System.out.println(defender.getName() + " wins the battle!");
                return 2;
            }
        }
        return 0;
    }
