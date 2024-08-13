package com.iamdeovrat.project.LetsRide.rideApp.repositories;

import com.iamdeovrat.project.LetsRide.rideApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface   DriverRepository extends JpaRepository<Driver,Long> {
}
