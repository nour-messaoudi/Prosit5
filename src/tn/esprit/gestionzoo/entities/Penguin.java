package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    // Constructeur
    public Penguin(String name, int age, String habitat, float swimmingDepth) {
        super(name, age, habitat); // Appel du constructeur de Aquatic
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                ", swimmingDepth=" + swimmingDepth +
                '}';
    }
}


