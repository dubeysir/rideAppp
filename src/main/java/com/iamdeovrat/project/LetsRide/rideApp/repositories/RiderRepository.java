package com.iamdeovrat.project.LetsRide.rideApp.repositories;

import com.iamdeovrat.project.LetsRide.rideApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}
