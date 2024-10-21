package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;

    // Constructeur
    public Aquatic(String name, int age, String habitat) {
        super(name, age); // Appel du constructeur de Animal
        this.habitat = habitat;
    }

    // Méthode swim()
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}

