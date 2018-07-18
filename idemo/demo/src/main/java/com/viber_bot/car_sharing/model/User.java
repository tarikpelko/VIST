package com.viber_bot.car_sharing.model;

import com.viber_bot.car_sharing.repository.UserRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;

    @Column(name = "viberID")
    private String viberID;

    @Column(name = "name")
    private String name;

    @Column(name = "subscribed")
    private String subscribed;

    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations = new ArrayList<>();



    public User(String name, String subscribed) {
        this.name = name;
        this.subscribed = subscribed;
    }

    public String getViberID(){return this.viberID;}
    public String getName(){return this.name;}
}


