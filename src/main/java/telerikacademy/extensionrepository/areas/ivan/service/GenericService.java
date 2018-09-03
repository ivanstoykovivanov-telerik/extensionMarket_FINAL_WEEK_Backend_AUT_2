package telerikacademy.extensionrepository.areas.ivan.service;


import telerikacademy.extensionrepository.areas.ivan.domain.RandomCity;
import telerikacademy.extensionrepository.areas.ivan.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();

    User save(User user);
}
