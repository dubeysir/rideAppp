package com.iamdeovrat.project.LetsRide.rideApp.services;

import com.iamdeovrat.project.LetsRide.rideApp.dto.DriverDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.SignupDto;
import com.iamdeovrat.project.LetsRide.rideApp.dto.UserDto;

public interface AuthService {
String login(String email,String password);
UserDto signup(SignupDto signupDto);
DriverDto onboardNewDriver(Long userId);
}
