package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private final List<User> users = generateUsers();

     
    @Override
    public List<User> getUsers() {
        return users; //TODO: A modifier
    }

    
    @Override
    public void generateRandomUser() {
        users.add(User.random());// TODO: A modifier
    }

    
    @Override
    public void deleteUser(User user) {
        users.remove(user); // TODO: A modifier
    }
}
