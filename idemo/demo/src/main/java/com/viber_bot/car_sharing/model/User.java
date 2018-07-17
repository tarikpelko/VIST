package com.viber_bot.car_sharing.model;

import com.viber_bot.car_sharing.repository.UserRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
public class User  {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long User_id;

    @Column(name = "viberID")
    private String ViberID;

    @Column(name = "name")
    private String Name;

    @Column(name = "subscribed")
    private String Subscribed;

    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations = new ArrayList<>();

    protected User() {
    }

    public User(String name, String subscribed) {
        this.Name = name;
        this.Subscribed = subscribed;
    }

    public String getViberID(){return this.ViberID;}
    public String getName(){return this.Name;}
}


