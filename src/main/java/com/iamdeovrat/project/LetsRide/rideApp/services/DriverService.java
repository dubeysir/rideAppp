package com.iamdeovrat.project.LetsRide.rideApp.services;

import com.iamdeovrat.project.LetsRide.rideApp.dto.DriverDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.RideDto;

import java.util.List;

public interface DriverService {
RideDto acceptRide(Long rideId);
RideDto cancelRide(Long rideId);
RideDto startRide(Long rideId);
RideDto endRide(Long rideId);
RideDto rateRider(Long rideId,Integer rating);

DriverDto getMyProfile();
List<RideDto> getAllMyRides();
}
