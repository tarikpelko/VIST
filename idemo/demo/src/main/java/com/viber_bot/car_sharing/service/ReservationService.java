package com.viber_bot.car_sharing.service;
import com.viber_bot.car_sharing.model.Reservation;
import com.viber_bot.car_sharing.model.Route;
import com.viber_bot.car_sharing.repository.ReservationRepository;
import com.viber_bot.car_sharing.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }
}