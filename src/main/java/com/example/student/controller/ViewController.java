package com.example.student.controller;

import com.example.student.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public String getCoursesPage(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses";
    }
}
