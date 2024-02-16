package me.imnotconsider.virtualpet.test2.repository.user;

import me.imnotconsider.virtualpet.test2.model.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImplUserRepository implements UserRepository{
    private final HashMap<String, User> users = new HashMap<>();
    @Override
    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user.getName());
    }

    @Override
    public User getUser(String name) {
        return users.get(name);
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }
}
