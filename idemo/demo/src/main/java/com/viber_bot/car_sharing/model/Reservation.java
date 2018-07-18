package com.viber_bot.car_sharing.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;

@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationID;

    @ManyToOne
    @JoinColumn(name="userID")
    private User user;

    @ManyToOne
    @JoinColumn(name="routeID")
    private Route route;

    @Column(name = "reservedseats")
    private int reserveadSeats;

    public Reservation(int reservedseats) {
        this.reserveadSeats = reservedseats;
    }
}
