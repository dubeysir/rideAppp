package com.iamdeovrat.project.LetsRide.rideApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;



@Entity
@Getter
@Setter//model mapper will not work
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private  Double rating;
    private Boolean available;
    @Column(columnDefinition = "Geometry(Point,4326)")  /*54min first video*/
    Point currentLocation;
}
