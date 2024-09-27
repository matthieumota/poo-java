package rpg;

import java.util.ArrayList;
import java.util.List;

class Character {
    protected String name;
    protected int life = 100;
    protected int strength = 10;
    protected int mana = 10;
    protected List<Item> items = new ArrayList<Item>();

    Character(String n) {
        this.name = n;
    }

    public void attack(Character target) {
        if (this.handleAttack(target, this.strength * 2)) {
            Character.debug(this.name + " attaque " + target.name);
        }
    }

    public Character pick(Item item) {
        this.items.add(item);

        return this;
    }

    protected boolean handleAttack(Character target, int damage) {
        target.life -= damage;

        if (target.life <= 0) {
            target.life = 0;
            Character.debug(this.name + " a tué " + target.name);
            return false;
        }

        return true;
    }

    /**
     * Permet de debug une instance.
     */
    public void debug() {
        Character.debug(
            "- Nom: " + this.name+"\n"+
            "- Points de vie: " + this.life+"\n"+
            "- Force: " + this.strength+"\n"+
            "- Mana: " + this.mana+"\n"+
            "- Items: " + this.items
        );
    }

    /**
     * Permet de debug une chaine même si on est pas dans l'instance.
     */
    public static void debug(String output) {
        String summary = "-".repeat(20);

        System.out.println(summary);
        System.out.println(output);
        System.out.println(summary);
    }
}
