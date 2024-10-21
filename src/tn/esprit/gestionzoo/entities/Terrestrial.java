package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    // Constructeur
    public Terrestrial(String name, int age, int nbrLegs) {
        super(name, age); // Appel du constructeur de Animal
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nbrLegs=" + nbrLegs +
                '}';
    }
}
