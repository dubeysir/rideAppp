package com.iamdeovrat.project.LetsRide.rideApp.services;

import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;
import com.iamdeovrat.project.LetsRide.rideApp.entities.Driver;
import com.iamdeovrat.project.LetsRide.rideApp.entities.Ride;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

     Ride getRideById(Long rideId);

     void matchWithdrivers(RideRequestDto rideRequestDto);
     Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
     Ride updateRideStatus (Long rideId, RideStatus rideStatus);
     Page<Ride> getAllridesOfRider(Long driverId, PageRequest pageRequest);//week 3
}
