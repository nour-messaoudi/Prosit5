package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

class ZooManagement {
    public static void main(String[] args) {
        Aquatic genericAquaticAnimal = new Aquatic("Generic Aquatic", 2, "Ocean");
        Dolphin dolphin = new Dolphin("Flipper", 5, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Pingu", 3, "Antarctica", 15.0f);
        Terrestrial lion = new Terrestrial("Simba", 4, 4);

      
        genericAquaticAnimal.swim(); // Affiche le message générique
        dolphin.swim(); // Affiche le message spécifique du dauphin
        penguin.swim(); // Affiche le message spécifique du pingouin

       
        System.out.println(genericAquaticAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(lion);
    }
}


