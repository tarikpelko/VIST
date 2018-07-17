package com.viber_bot.car_sharing.repository;

import com.viber_bot.car_sharing.model.Reservation;
import com.viber_bot.car_sharing.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    public List<Reservation> findAll();

}
