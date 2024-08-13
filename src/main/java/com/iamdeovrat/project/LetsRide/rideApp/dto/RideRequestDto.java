package com.iamdeovrat.project.LetsRide.rideApp.dto;

import com.iamdeovrat.project.LetsRide.rideApp.entities.Rider;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.PaymentMethod;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.awt.*;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private  Long id;
    private Point pickuplocation;
    private  Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;
}
