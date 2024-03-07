package com.eli.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eli.curso.springboot.webapp.springbootweb.models.User;
import com.eli.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Eli", "Mora");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo");
        return userDto;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Eli", "Mora");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo");
        body.put("user", user);
        return body;
    }


}
