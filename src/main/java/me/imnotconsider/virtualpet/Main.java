package me.imnotconsider.virtualpet;

import me.imnotconsider.virtualpet.test2.Pet;
import me.imnotconsider.virtualpet.test2.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> catMessages = List.of("cat phrase1", "cat phrase2", "cat phrase3");
        Pet cat = new Pet("Сфе", 1, "cat food", catMessages, "imnotconsider ????");

        List<String> dogMessages = List.of("dog phrase1", "dog phrase2", "dog phrase3");
        Pet dog = new Pet("dOG", 1, "humans", dogMessages, "111 23 3");

        User user = new User("Alice");
        user.addPet(cat);
        user.addPet(dog);

        user.interactWithPets();
    }
}