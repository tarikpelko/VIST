package com.viber_bot.car_sharing.controller;

import com.viber_bot.car_sharing.model.Reservation;
import com.viber_bot.car_sharing.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReservationController {
    @Autowired
    ReservationService reservationService;

}
