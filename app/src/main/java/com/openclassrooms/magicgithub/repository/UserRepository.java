package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser
        // type de variable   variable de type ApiService
    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        apiService.generateRandomUser();// TODO: A modifier
    }

    public void deleteUser(User user) {
        apiService.deleteUser(user);// TODO: A modifier
    }
}
