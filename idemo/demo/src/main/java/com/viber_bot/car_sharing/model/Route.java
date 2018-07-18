package com.viber_bot.car_sharing.model;

import javax.persistence.*;
import java.sql.Time;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Route")
public class Route {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long routeID;

    @Column(name="start")
    private String start;

    @Column(name = "destination")
    private String destination;

    @Column(name = "date")
    private DateFormat date;

    @Column(name = "time")
    private Time time;

    @Column(name = "avalibleseats")
    private int avalibleSeats;

    @OneToMany(mappedBy = "route")
    private List<Reservation> reservations = new ArrayList<>();


    protected Route() {
    }

    public Route(String start, String destination, DateFormat date, java.sql.Time time, int avalibleSeats) {
        this.start = start;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.avalibleSeats = avalibleSeats;
    }
}
