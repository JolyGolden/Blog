package org.itstep.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("title", "main page");
        return "home";
    }

//    @GetMapping("/")
//    public String homePage1(Model model){
//        model.addAttribute("title ", "main page");
//        return "home1";
//    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "about me");
        return "about";
    }


}