package com.iamdeovrat.project.LetsRide.rideApp.entities;

import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.PaymentMethod;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.awt.*;
import java.time.LocalDateTime;
@Entity
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickuplocation;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private  Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @ManyToOne(fetch=FetchType.LAZY)//01hr04min
    private Rider rider;

    @ManyToOne(fetch=FetchType.LAZY)//01hr04min
    private Rider driver;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
