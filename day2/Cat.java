package day2;

import java.time.LocalDate;
import java.time.Period;

class Cat {
    private String name;
    private LocalDate birthday;
    private Address address;

    Cat(String n, LocalDate b) {
        this.name = n;
        this.birthday = b;
    }

    public Address getAddress() {
        return this.address;
    }

    public Cat setAddress(Address a) {
        this.address = a;

        return this;
    }

    public String getName() {
        return this.name;
    }

    public Cat setName(String n) {
        this.name = n;

        return this;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public int age() {
        // Avoir une "période" entre date de naissance et date actuelle
        return Period.between(this.getBirthday(), LocalDate.now()).getYears();
    }

    // Cette méthode "magique" me permet juste d'afficher l'objet comme une chaine
    public String toString() {
        return this.name + " a " + this.age() + " ans. Il est né en " + this.getBirthday().getYear();
    }
}
