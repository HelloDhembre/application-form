package com.vaibhav.springboot_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "application_forms")
public class ApplicationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String childFirstName;
    private String childLastName;
    private String dob;
    private String gender;
    private String guardianFirstName;
    private String guardianLastName;
    private String guardianPhone;
    private String guardianEmail;
}
