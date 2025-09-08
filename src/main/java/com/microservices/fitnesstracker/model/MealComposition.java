package com.microservices.fitnesstracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MealComposition {

    private Double protein;
    private Double carbs;
    private Double fats;

}
