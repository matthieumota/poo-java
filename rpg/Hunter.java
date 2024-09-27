package rpg;

class Hunter extends Character {
    Hunter(String n) {
        super(n);
    }

    public void rangedAttack(Character target) {
        if (this.handleAttack(target, this.strength * 3)) {
            Character.debug(this.name + " attaque à distance " + target.name);
        }
    }

    protected boolean handleAttack(Character target, int damage) {
        // On imagine que Legolas lance 4 flèches...
        super.handleAttack(target, damage);
        super.handleAttack(target, damage);
        super.handleAttack(target, damage);

        return super.handleAttack(target, damage);
    }
}
