package com.viber_bot.car_sharing.repository;

import com.viber_bot.car_sharing.model.Reservation;
import com.viber_bot.car_sharing.model.Route;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository {
    public String findAll();
    public String findByID(int ID);
    public void save(Reservation reservation);
    public void delete(int ID);
    public String findReservationByRoute(Route route);
}
