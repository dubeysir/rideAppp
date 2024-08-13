package com.iamdeovrat.project.LetsRide.rideApp.repositories;

import com.iamdeovrat.project.LetsRide.rideApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest,Long> {
}
