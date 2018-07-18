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
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Reservation_id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="route_id")
    private Route route;

    @Column(name = "reservedseats")
    private int ReserveadSeats;

    protected Reservation() {
    }

    public Reservation(int reservedseats) {
        this.ReserveadSeats = reservedseats;
    }
}
