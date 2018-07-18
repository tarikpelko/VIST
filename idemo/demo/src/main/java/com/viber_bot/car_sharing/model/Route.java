package com.viber_bot.car_sharing.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    private long id;

    @Column(name="start")
    private String start;

    @Column(name = "destination")
    private String destination;

    @Column(name = "date")
    private DateFormat date;

    @Column(name = "time")
    private Time time;

    @Column(name = "avalibleseats")
    private int avaliableSeats;

    @OneToMany(mappedBy = "route")
    private List<Reservation> reservations = new ArrayList<>();


    protected Route() {
    }



    public Route(String start, String destination, DateFormat date, java.sql.Time time, int avalibleSeats) {
        this.start = start;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.avaliableSeats = avalibleSeats;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getAvaliableSeats() {
        return avaliableSeats;
    }

    public void setAvaliableSeats(int avaliableSeats) {
        this.avaliableSeats = avaliableSeats;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
