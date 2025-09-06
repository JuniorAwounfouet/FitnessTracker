package com.microservices.fitnesstracker.repository;

import com.microservices.fitnesstracker.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout,Long> {
}
