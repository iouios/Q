public class iouios {
    public static void main(String[] args) {
        Player p = new Player();
        p.attack();
        p.defend();
        p.castSpell("magic light of hope");
        p.useweapon();
    }
}

interface Character {
    void attack();

    void defend();
}

interface Mage {
    void castSpell(String spell);
}

interface Warrior {
    void useweapon();
}

class Player implements Character, Mage, Warrior {

    public void attack() {
        System.out.println("The player attacks the enemy.");
    }

    public void defend() {
        System.out.println("The player defends against the enemy's attack.");
    }

    public void castSpell(String spell) {
        System.out.println("The player casts " + spell);
    }

    public void useweapon() {
        System.out.println("The player use a weapon to the enemy.");
    }
}