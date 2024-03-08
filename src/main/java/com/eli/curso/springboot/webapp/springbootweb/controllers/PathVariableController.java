package com.eli.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eli.curso.springboot.webapp.springbootweb.models.User;
import com.eli.curso.springboot.webapp.springbootweb.models.dto.ParamDto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.code}")
    private Integer code;
    @Value("${config.username}")
    private String username;
    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @GetMapping("baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
    
    @GetMapping("mix/{message}/{code}")
    public ParamDto mix(@PathVariable String message, @PathVariable Integer code) {
        
        ParamDto param = new ParamDto();
        param.setMessage(message);
        param.setCode(code);
        return param;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        //save in DB
        return user;
    }

    @GetMapping("values")
    public Map<String, Object> values(@Value("${config.message}") String message) {
        //value injection
        Map<String, Object> json = new HashMap<String, Object>();
        
        json.put("code", code);
        json.put("username", username);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        return json;
    }
    
    
}
