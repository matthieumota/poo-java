package rpg;

class Magus extends Character {
    Magus(String n) {
        super(n);

        this.mana *= 2;
    }

    public void castSpell(Character target) {
        if (this.handleAttack(target, this.mana * 3)) {
            Character.debug(this.name + " lance un sort à " + target.name);
        }
    }
}
