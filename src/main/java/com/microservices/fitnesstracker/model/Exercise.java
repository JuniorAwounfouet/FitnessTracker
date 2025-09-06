package com.microservices.fitnesstracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="EXERCISE")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String muscleGroup;
    private int sets;
    private int reps;
    private double weight;
    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;

}
