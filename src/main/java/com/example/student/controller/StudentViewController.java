package com.example.student.controller;

import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentViewController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getStudentsPage(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
}
