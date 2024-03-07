package com.eli.curso.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.eli.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    //Thymeleaf
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Eli", "Mora");
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        
        List<User> users = new ArrayList<>();
        
        model.addAttribute("title", "Listado de usuarios");
        model.addAttribute("users", users);
        return "list";
    }
}
