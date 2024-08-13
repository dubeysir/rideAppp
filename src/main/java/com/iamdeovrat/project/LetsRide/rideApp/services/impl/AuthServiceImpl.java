package com.iamdeovrat.project.LetsRide.rideApp.services.impl;

import com.iamdeovrat.project.LetsRide.rideApp.dto.DriverDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.SignupDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.UserDto;
import com.iamdeovrat.project.LetsRide.rideApp.services.AuthService;
import org.springframework.stereotype.Service;
//to achive loos coupling
@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
