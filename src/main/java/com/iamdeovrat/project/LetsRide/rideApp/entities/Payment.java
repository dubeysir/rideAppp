package com.iamdeovrat.project.LetsRide.rideApp.entities;

import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.PaymentMethod;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.PaymentStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private  Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    private  Double amount;
@Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
@CreationTimestamp
private LocalDateTime paymentTime;
}
