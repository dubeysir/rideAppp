package com.iamdeovrat.project.LetsRide.rideApp.repositories;

import com.iamdeovrat.project.LetsRide.rideApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long> {
}
