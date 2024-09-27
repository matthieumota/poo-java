package rpg;

class App {
    public static void main(String[] args) {
        Character aragorn = new Warrior("Aragorn");
        Hunter legolas = new Hunter("Legolas");
        Magus gandalf = new Magus("Gandalf");

        aragorn.debug();
        legolas.debug();
        gandalf.debug();

        aragorn.attack(legolas);
        aragorn.attack(legolas);
        aragorn.attack(legolas);
        legolas.debug();
        legolas.rangedAttack(gandalf);
        gandalf.debug();
        gandalf.castSpell(aragorn);
        aragorn.debug();

        Item potion = new Item("Potion");
        Item sword = new Item("Sword");

        aragorn.pick(potion) // Aragorn ramasse une potion
            .pick(sword); // Aragorn ramasse une épée

        aragorn.debug();
    }
}
