package com.iamdeovrat.project.LetsRide.rideApp.repositories;

import com.iamdeovrat.project.LetsRide.rideApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
