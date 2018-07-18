package com.viber_bot.car_sharing.controller;

import com.viber_bot.car_sharing.model.Reservation;
import com.viber_bot.car_sharing.model.Route;
import com.viber_bot.car_sharing.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    public String getAllReservation(Model model) {
        List<Reservation> resList = new ArrayList<>();
        //reservationService.save(new Reservation(1, 2, null, 2));
        resList = reservationService.findAll();
        model.addAttribute("reservations",resList);
        return "Reservations";
    }

}

