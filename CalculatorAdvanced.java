class CalculatorAdvanced {
    // Une propriété private n'est visible que
    // dans la classe elle même
    private int result;
    private boolean opened;

    // Une méthode "fluent" retourne l'objet lui même
    // pour pouvoir le chainer
    public CalculatorAdvanced add(int n) {
        this.result += n;

        return this;
    }

    public CalculatorAdvanced substract(int n) {
        this.result -= n;

        return this;
    }

    public CalculatorAdvanced divide(int n) {
        if (n == 0) {
            return this;
        }

        this.result /= n;

        return this;
    }

    public CalculatorAdvanced multiply(int n) {
        this.result *= n;

        return this;
    }

    // Une méthode "getter" permet d'accèder à une propriété
    // privée (getNomDeLaPropriété())
    public int getResult() {
        return this.result;
    }

    public boolean isOpened() {
        return this.opened;
    }

    // Une méthode "setter" permet de modifier une propriété
    // privée
    public CalculatorAdvanced setOpened(boolean state) {
        this.opened = state;

        return this;
    }

    // Un "raccourci" pour ouvrir / fermer sans se prendre la tête
    public CalculatorAdvanced toggle() {
        // this.opened = !this.opened;
        this.setOpened(!this.opened);

        return this;
    }
}
