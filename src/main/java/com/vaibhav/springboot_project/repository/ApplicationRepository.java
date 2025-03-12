package com.vaibhav.springboot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhav.springboot_project.model.ApplicationForm;

public interface ApplicationRepository extends JpaRepository<ApplicationForm, Long> {
}