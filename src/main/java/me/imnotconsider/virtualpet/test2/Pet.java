package me.imnotconsider.virtualpet.test2;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Pet {
    @NonNull private String type;
    @NonNull private int age;
    @NonNull private String favoriteFood;
    @NonNull private List<String> messages;
    @NonNull private String story;
    private int messageIndex = 0;

    public void sendRandomMessage() {
        System.out.println(type + " says: " + messages.get(messageIndex));
        messageIndex = (messageIndex + 1) % messages.size();
    }

    public void tellStory() {
        System.out.println("hello! type = " + type + ", story = " + story);
    }
}
