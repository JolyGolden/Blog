package org.itstep.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/loginUser")
    public String login(Model model) {
        model.addAttribute("login", "registration page");
        return "blog-login";

    }
}
