package me.imnotconsider.virtualpet.test2;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class User {
    private String name;
    private final List<Pet> pets;

    public User(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        log.info("user-{} add pet: {}", this.name, pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
        log.info("user-{} remove pet: {}", this.name, pet);
    }

    public void removePet(int index) {
        pets.remove(index);
        log.info("user-{} remove pet-{}", this.name, index);
    }

    public void interactWithPets() {
        for (Pet pet : pets) {
            pet.tellStory();
            pet.sendRandomMessage();
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                log.warn("error: {}", e.getMessage());
            }
        }
    }
}