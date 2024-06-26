package edu.miu.cs489.lab03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
    public String displayHomePage() {
        return "home/index";
    }
}
