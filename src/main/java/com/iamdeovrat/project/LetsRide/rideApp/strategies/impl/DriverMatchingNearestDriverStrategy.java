package com.iamdeovrat.project.LetsRide.rideApp.strategies.impl;

import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;
import com.iamdeovrat.project.LetsRide.rideApp.entities.Driver;
import com.iamdeovrat.project.LetsRide.rideApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {


    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
