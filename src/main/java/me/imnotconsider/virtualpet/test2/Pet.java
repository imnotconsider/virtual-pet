package me.imnotconsider.virtualpet.test2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class Pet {
    private String type;
    private int age;
    private String favoriteFood;
    private List<String> messages;
    private String story;

    public void sendRandomMessage() {
        Random random = new Random();
        int index = random.nextInt(messages.size());
        System.out.println(messages.get(index));
    }

    public void tellStory() {
        System.out.println("hello! type = " + type + ", story = " + story);
    }
}
