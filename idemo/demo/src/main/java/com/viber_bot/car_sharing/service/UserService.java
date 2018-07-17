package com.viber_bot.car_sharing.service;

import com.viber_bot.car_sharing.model.User;
import com.viber_bot.car_sharing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService  {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
