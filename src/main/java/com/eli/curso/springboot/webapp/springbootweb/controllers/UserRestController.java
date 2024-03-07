package com.eli.curso.springboot.webapp.springbootweb.controllers;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

    @GetMapping("/list")
    public List<User> list(){
        User user1 = new User("John", "Doe");
        User user2 = new User("Jane", "Smith");
        User user3 = new User("Michael", "Johnson");
        User user4 = new User("Anna", "Garcia");
        User user5 = new User("Clementina", "Roma");

        /* 
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5); 
        */

        List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
        return users;
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
