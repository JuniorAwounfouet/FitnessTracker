package com.microservices.fitnesstracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String username;
    //    private String password;
//    private String email;
    private int age;
//    private double weight;
//    private double height;

}
