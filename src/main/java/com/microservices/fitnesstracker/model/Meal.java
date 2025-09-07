package com.microservices.fitnesstracker.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.microservices.fitnesstracker.Enum.Goal;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name="MEAL")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate date;
    private Double calories;
    private Double protein;
    private Double carbs;
    private Double fats;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;
}
