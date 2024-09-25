import java.time.LocalDateTime;

class Car {
    String brand;
    String model;
    int wheels = 4;
    String color = "blanche";
    int year;
    int kilometers;
    int fuel = 1;

    Car(String b, String m) {
        this.brand = b;
        this.model = m;
    }

    Car(String b, String m, int year, int k, String color) {
        this(b, m);
        this.year = year;
        this.kilometers = k;
        this.color = color;
    }

    String present() {
        int currentYear = LocalDateTime.now().getYear();
        int averageKm = this.kilometers / (currentYear - this.year);

        if (this.year == 0) {
            this.year = currentYear;
            averageKm = this.kilometers;
        }

        return String.format("%s %s livrée en %d avec %d km de couleur %s. Elle a fait %d km par an depuis sa livraison.", this.brand, this.model, this.year, this.kilometers, this.color, averageKm);
    }

    void drive() {
        this.fuel -= 2;

        if (this.fuel <= 0) {
            this.fuel = 0;

            System.out.println("La "+this.brand+" ne peut pas rouler ou s'arrête");
            return; // Stop le code dans la méthode
        }

        System.out.println("La "+this.brand+" roule, il lui reste "+fuel+"L");
    }

    void klaxon() {
        System.out.println("La "+this.brand+" klaxonne");
    }
}
