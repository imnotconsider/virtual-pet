package me.imnotconsider.virtualpet;

import me.imnotconsider.virtualpet.test2.model.Pet;
import me.imnotconsider.virtualpet.test2.model.user.User;
import me.imnotconsider.virtualpet.test2.repository.pet.ImplPetRepository;
import me.imnotconsider.virtualpet.test2.repository.pet.PetRepository;
import me.imnotconsider.virtualpet.test2.repository.user.ImplUserRepository;
import me.imnotconsider.virtualpet.test2.repository.user.UserRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new ImplUserRepository();
        PetRepository petRepository = new ImplPetRepository();

        User user = new User();
        userRepository.addUser(user);

        List<String> catMessages = List.of("cat phrase1", "cat phrase2", "cat phrase3");
        petRepository.add(new Pet("григорий","Сфе", 1, "cat food", catMessages, "imnotconsider ????"));

        List<String> dogMessages = List.of("dog phrase1", "dog phrase2", "dog phrase3");
        petRepository.add(new Pet("вячеслав","dOG", 1, "humans", dogMessages, "111 23 3"));

        user.addPet(petRepository.get("григорий"));
        user.addPet(petRepository.get("вячеслав"));

        user.interactWithPets();
    }
}