package com.iamdeovrat.project.LetsRide.rideApp.strategies;

import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

double calculateFare(RideRequestDto rideRequestDto);
}
