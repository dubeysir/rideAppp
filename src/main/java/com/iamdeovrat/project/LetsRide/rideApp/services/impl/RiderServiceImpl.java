package com.iamdeovrat.project.LetsRide.rideApp.services.impl;

import com.iamdeovrat.project.LetsRide.rideApp.dto.RideDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.RideRequestDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.RiderDto;
import com.iamdeovrat.project.LetsRide.rideApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return null;
    }
}
