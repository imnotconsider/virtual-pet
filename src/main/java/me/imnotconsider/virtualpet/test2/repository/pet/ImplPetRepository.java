package me.imnotconsider.virtualpet.test2.repository.pet;

import me.imnotconsider.virtualpet.test2.model.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImplPetRepository implements PetRepository{
    private final HashMap<String, Pet> pets = new HashMap<>();

    @Override
    public void add(Pet pet) {
        pets.put(pet.getName(), pet);
    }

    @Override
    public void remove(Pet pet) {
        pets.remove(pet.getName());
    }

    @Override
    public Pet get(String name) {
        return pets.get(name);
    }

    @Override
    public List<Pet> getPets() {
        return new ArrayList<>(pets.values());
    }
}
