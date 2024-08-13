package com.iamdeovrat.project.LetsRide.rideApp.dto;

import com.iamdeovrat.project.LetsRide.rideApp.entities.Rider;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.PaymentMethod;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.RideStatus;

import java.awt.*;
import java.time.LocalDateTime;

public class RideDto {
    private  Long id;
    private Point pickuplocation;
    private  Point dropOffLocation;


    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;
    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
