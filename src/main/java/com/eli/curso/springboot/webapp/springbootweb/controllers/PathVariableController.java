package com.eli.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eli.curso.springboot.webapp.springbootweb.models.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
    
}
