package day2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

class Cat {
    private String name;
    private LocalDate birthday;
    private Address address;
    private List<Cat> friends;

    Cat(String n, LocalDate b) {
        this.name = n;
        this.birthday = b;
        this.friends = new ArrayList<Cat>();
    }

    public Cat addFriend(Cat friend) {
        this.friends.add(friend);

        return this;
    }

    public List<Cat> getFriends() {
        return this.friends;
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
