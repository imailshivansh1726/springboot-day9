package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("student", new Student());
        model.addAttribute("students", service.getAllStudents());

        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student student) {

        service.saveStudent(student);

        return "redirect:/";
    }

}