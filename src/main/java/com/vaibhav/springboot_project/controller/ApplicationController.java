package com.vaibhav.springboot_project.controller; // ✅ Corrected

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaibhav.springboot_project.model.ApplicationForm; // Ensure this import is correct and the class exists
import com.vaibhav.springboot_project.service.ApplicationService;

@Controller
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/application-form")
    public String showForm(Model model) {
        model.addAttribute("applicationForm", new ApplicationForm()); // ✅ Corrected
        return "application-form";
    }

    @PostMapping("/submit-form")
    public String submitForm(@ModelAttribute ApplicationForm form, Model model) {
        applicationService.saveApplication(form); // ✅ Corrected
        model.addAttribute("message", "Application submitted successfully!"); // ✅ Corrected
        return "success";
    }
}
