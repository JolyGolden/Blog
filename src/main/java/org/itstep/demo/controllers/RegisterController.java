package org.itstep.demo.controllers;

import org.itstep.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepo;


    @GetMapping("/registration")
    public String register(Model model) {
        model.addAttribute("user", "registration page");
        return "blog-registration";

    }


}
