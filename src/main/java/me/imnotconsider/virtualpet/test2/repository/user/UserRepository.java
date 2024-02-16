package me.imnotconsider.virtualpet.test2.repository.user;

import me.imnotconsider.virtualpet.test2.model.User;

import java.util.List;

public interface UserRepository {
    void addUser(User user);
    void removeUser(User user);
    User getUser(String name);
    List<User> getUsers();
}