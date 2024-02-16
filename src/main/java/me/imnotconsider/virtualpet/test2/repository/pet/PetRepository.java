package me.imnotconsider.virtualpet.test2.repository.pet;

import me.imnotconsider.virtualpet.test2.model.Pet;

import java.util.List;

public interface PetRepository {
    void add(Pet pet);
    void remove(Pet pet);
    Pet get(String name);
    List<Pet> getPets();
}
