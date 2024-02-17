package me.imnotconsider.virtualpet.test2.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Log4j2
@Data
public class User {
    private String name;
    private final List<Pet> pets = new ArrayList<>();

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
        ExecutorService executor = Executors.newFixedThreadPool(pets.size());
        for (Pet pet : pets) {
            executor.execute(pet::interact);
        }
        executor.shutdown();
    }
}