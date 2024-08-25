package com.iamdeovrat.project.LetsRide.rideApp.strategies;

import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;
import com.iamdeovrat.project.LetsRide.rideApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

     List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
