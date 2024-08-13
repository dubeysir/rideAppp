package com.iamdeovrat.project.LetsRide.rideApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.Role;

import java.util.Set;

@Entity//we are adding this in order to make entity
//coming from jakarta persistance API
@Table(name="app_user")
@Getter
@Setter//model mapper will not work
public class User {
    @Id//id mark a field as primary key
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    //This annotation is typically used in combination with the @Id annotation
    // to define a primary key that is automatically generated by the database or by JPA.
    //IDENTITY:agar normally use krna h ID ko
    //SEQUENCE:used in batch operation i.e,saving data in bunch
    private Long id;

    private  String name;
    @Column(unique = true)//unique=true mtbl email unique rhengi
    private  String email;
    private  String password;
    @ElementCollection(fetch = FetchType.LAZY)
    //set ko seprat table me store krne ke liye
    //it will create table for role
    //ye important h kuch alag bhi h
    //2nd weak 39 min
    @Enumerated(EnumType.STRING)
    //ye enum ka type batata h
    // do hote h:ORDINAL and STRING
    private Set<Role> roles;

}
