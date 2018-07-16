package com.viber_bot.car_sharing.model;

import javax.persistence.*;

@Entity
@Table(name = "Reservation")
public class Reservation {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Id
    @Column(name="userID")
    private Long UserID;

    @Column(name = "reservedseats")
    private int ReserveadSeats;

    protected Reservation() {
    }

    public Reservation(int reservedseats) {
        this.ReserveadSeats = reservedseats;
    }
}
