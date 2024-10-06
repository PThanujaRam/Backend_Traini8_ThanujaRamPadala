package com.klu.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "training_centers")
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Size(min = 12, max = 12)
    private String centerCode;

    @Embedded
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Long createdOn;

    @Email
    private String contactEmail;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number")
    private String contactPhone;

    public void setCreatedOn(long currentTimeMillis) {
        this.createdOn = currentTimeMillis; // Set the createdOn timestamp correctly
    }


    // Getters and Setters
}
