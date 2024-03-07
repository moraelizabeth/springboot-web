
package com.eli.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.eli.curso.springboot.webapp.springbootweb.models.dto.ParamDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/params")

public class RequestParamsController {
    //api/params/foo?message=message

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;

    }
    
}