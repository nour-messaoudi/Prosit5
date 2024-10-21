package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;


    public Terrestrial(String name, int age, int nbrLegs) {
        super(name, age); 
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
