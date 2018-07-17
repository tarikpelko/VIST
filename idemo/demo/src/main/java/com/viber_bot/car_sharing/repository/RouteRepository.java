package com.viber_bot.car_sharing.repository;

import com.viber_bot.car_sharing.model.Route;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository {
    public String findAll();
    public String findByID(int ID);
    public void save(Route route);
    public void delete(int ID);
    public void edit(int ID, Route editedRoute);
}
