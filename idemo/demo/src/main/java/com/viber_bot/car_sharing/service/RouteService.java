package com.viber_bot.car_sharing.service;

import com.viber_bot.car_sharing.model.Route;
import com.viber_bot.car_sharing.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    @Autowired
    RouteRepository routeRepository;
    public List<Route> findAll() {
        return routeRepository.findAll();
    }

    public void save(Route route) {
        routeRepository.save(route);
    }
}
