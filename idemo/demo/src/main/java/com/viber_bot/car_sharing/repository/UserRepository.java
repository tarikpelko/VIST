package com.viber_bot.car_sharing.repository;

import com.viber_bot.car_sharing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {


    public List<User> findAll();


}
