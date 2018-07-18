package com.viber_bot.car_sharing.repository;

import com.viber_bot.car_sharing.model.Route;
import com.viber_bot.car_sharing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
    public List<Route> findAll();

    public Route findById(long id);
     /*
    public void deleteById(long id);*/
}


