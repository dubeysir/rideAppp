package com.iamdeovrat.project.LetsRide.rideApp.services.impl;

import com.iamdeovrat.project.LetsRide.rideApp.dto.DriverDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.RideDto;
import com.iamdeovrat.project.LetsRide.rideApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return null;
    }
}
