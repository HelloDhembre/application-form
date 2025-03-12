package com.vaibhav.springboot_project.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.springboot_project.model.ApplicationForm;
import com.vaibhav.springboot_project.repository.ApplicationRepository;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public void saveApplication(ApplicationForm form) {
        applicationRepository.save(form);
    }
    
}
