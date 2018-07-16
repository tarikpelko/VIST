package com.viber_bot.car_sharing.model;

import javax.persistence.*;
import java.sql.Time;
import java.text.DateFormat;

@Entity
@Table(name = "Route")
public class Route {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="start")
    private String Start;

    @Column(name = "destination")
    private String Destination;

    @Column(name = "date")
    private DateFormat Date;

    @Column(name = "time")
    private Time Time;

    @Column(name = "avalibleseats")
    private int AvalibleSeats;

    protected Route() {
    }

    public Route(String start, String destination, DateFormat date, java.sql.Time time, int avalibleSeats) {
        this.Start = start;
        this.Destination = destination;
        this.Date = date;
        this.Time = time;
        this.AvalibleSeats = avalibleSeats;
    }
}
