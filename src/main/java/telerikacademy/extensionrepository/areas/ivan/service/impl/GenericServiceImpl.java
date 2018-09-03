package telerikacademy.extensionrepository.areas.ivan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import telerikacademy.extensionrepository.areas.ivan.domain.RandomCity;
import telerikacademy.extensionrepository.areas.ivan.domain.User;
import telerikacademy.extensionrepository.areas.ivan.repository.RandomCityRepository;
import telerikacademy.extensionrepository.areas.ivan.repository.LoginUserRepository;
import telerikacademy.extensionrepository.areas.ivan.service.GenericService;

import java.util.List;

@Service
public class GenericServiceImpl implements GenericService {


    @Autowired
    private LoginUserRepository loginUserRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return loginUserRepository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        return loginUserRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) loginUserRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
}
