package rpg;

class Hunter extends Character {
    Hunter(String n) {
        super(n);
    }

    public void rangedAttack(Character target) {
        if (super.handleAttack(target, this.strength * 3)) {
            Character.debug(this.name + " attaque à distance " + target.name);
        }
    }

    protected boolean handleAttack(Character target, int factor) {
        System.out.println("Je fais n'importe quoi ici mais ça marche car j'utilise super...");

        return false;
    }
}
