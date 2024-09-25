class App2 {
    void main(String[] args) {
        // Création de ma calculette à partir du plan
        Calculator calculator = new Calculator();

        // Appel d'une fonctionnalité
        calculator.add(1, 4);

        // Appel de ma fonction
        calculator.display();

        Stylo bicB = new Stylo(10);
        Stylo bicHB = new Stylo(15);

        bicB.use();
        bicB.use();

        bicHB.use();

        bicB.diagnostic();
        bicHB.diagnostic();
    }
}

// Le plan de ma calculatrice
class Calculator {
    int result = 0;

    Calculator(int result) { // Quand on fait new Calculator(5)
        this.result = result;
    }

    Calculator() {
        this(0); // Calculator(0)
    }

    // Une fonctionnalité de ma calculatrice (additionner)
    void add(int a, int b) {
        result += a + b;
    }

    void display() {
        System.out.print(result);
    }
}

// Stylo
class Stylo {
    int size;

    Stylo(int s) {
        size = s;
    }

    void use() {
        size = size - 1;
    }

    void diagnostic() {
        System.out.println("Il reste "+size+" sur ce stylo...");
    }
}
