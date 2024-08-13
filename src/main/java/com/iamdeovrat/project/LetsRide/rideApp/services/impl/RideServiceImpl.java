package com.iamdeovrat.project.LetsRide.rideApp.services.impl;

import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;
import com.iamdeovrat.project.LetsRide.rideApp.entities.Driver;
import com.iamdeovrat.project.LetsRide.rideApp.entities.Ride;
import com.iamdeovrat.project.LetsRide.rideApp.entities.enums.RideStatus;
import com.iamdeovrat.project.LetsRide.rideApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithdrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllridesOfRider(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
