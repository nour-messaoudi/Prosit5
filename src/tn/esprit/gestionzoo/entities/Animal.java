package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String name;
    protected int age;

   
    public Animal(String name, int age) {
        this.name = name;
        this.age = Math.max(age, 0); 
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return "";
    }
}
