package com.iamdeovrat.project.LetsRide.rideApp.services;

import com.iamdeovrat.project.LetsRide.rideApp.dto.DriverDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.RideDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.RiderDto;

import java.util.List;

public interface RiderService {


    RideRequestDto requestRide(RideRequestDto rideRequestDto);
    RideDto cancelRide(Long rideId);
  //  RideDto startRide(Long rideId);
  //  RideDto endRide(Long rideId);
    RideDto rateDriver(Long rideId,Integer rating);

    RiderDto getMyProfile();
    List<RideDto> getAllMyRides();
}

