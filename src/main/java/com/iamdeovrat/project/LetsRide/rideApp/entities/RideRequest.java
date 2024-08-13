package com.iamdeovrat.project.LetsRide.rideApp.entities;

import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.PaymentMethod;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.awt.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter//model mapper will not work
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickuplocation;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private  Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;

    @ManyToOne(fetch=FetchType.LAZY)//01hr04min
    private Rider rider;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

}
