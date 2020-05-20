package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/")
    public String loadForm(Model model){
        model.addAttribute("form", new Form());
        return "questions";
    }
    @PostMapping("/")
    public String loadForm(@Valid Form form, Model model){
        model.addAttribute("form", form);
        return "questions";
    }



}
