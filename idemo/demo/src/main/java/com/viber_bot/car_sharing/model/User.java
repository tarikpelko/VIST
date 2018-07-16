package com.viber_bot.car_sharing.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")

public class User {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "viberID")
    private String ViberID;

    @Column(name = "name")
    private String Name;

    @Column(name = "subscribed")
    private String Subscribed;

    List<Reservation> reservations = new ArrayList<>();

    protected User() {
    }

    public User(String name, String subscribed) {
        this.Name = name;
        this.Subscribed = subscribed;
    }
}


