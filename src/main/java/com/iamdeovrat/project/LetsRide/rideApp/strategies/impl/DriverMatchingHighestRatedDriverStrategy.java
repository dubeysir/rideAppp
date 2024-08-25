package com.iamdeovrat.project.LetsRide.rideApp.strategies.impl;

import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;
import com.iamdeovrat.project.LetsRide.rideApp.entities.Driver;
import com.iamdeovrat.project.LetsRide.rideApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {


    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
