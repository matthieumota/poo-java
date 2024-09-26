package day2;

import java.time.LocalDate;

class App {
    void main(String[] args) {
        Cat garfield = new Cat("Garfield", LocalDate.of(2004, 9, 27));

        garfield.setName("Toto")
            .setName("Bleu");
        System.out.println(garfield.getName());
        System.out.println(garfield.getBirthday());
        System.out.println(garfield.age());
        System.out.println(garfield);
    }
}
