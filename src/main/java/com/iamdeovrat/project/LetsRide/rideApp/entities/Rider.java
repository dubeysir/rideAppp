package com.iamdeovrat.project.LetsRide.rideApp.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter//model mapper will not work
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne//bcz each rider will have only one user
    //weak 3
    //use to connect user table to rider table
    @JoinColumn(name = "user_id")
    private  User user;
    private Double rating;

}
