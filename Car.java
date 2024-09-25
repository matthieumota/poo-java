import java.time.LocalDateTime;

class Car {
    String brand;
    String model;
    int wheels = 4;
    String color = "blanche";
    int year;
    int kilometers = 0;
    int fuel = 50;

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
        int averageKm = kilometers / (currentYear - year);

        if (year == 0) {
            year = currentYear;
            averageKm = kilometers;
        }

        return String.format("%s %s livrée en %d avec %d km de couleur %s. Elle a fait %s km par an depuis sa livraison.", brand, model, year, kilometers, color, averageKm);
    }

    void drive() {
        fuel -= 2;

        if (fuel <= 0) {
            fuel = 0;
        }

        System.out.println("La "+this.brand+" roule, il lui reste "+fuel+"L");
    }

    void klaxon() {
        System.out.println("La "+this.brand+" klaxonne");
    }
}
