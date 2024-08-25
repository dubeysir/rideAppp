package com.iamdeovrat.project.LetsRide.rideApp.strategies.impl;

import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;
import com.iamdeovrat.project.LetsRide.rideApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
