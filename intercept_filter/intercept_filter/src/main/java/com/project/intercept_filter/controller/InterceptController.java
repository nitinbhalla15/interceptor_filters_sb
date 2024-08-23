package com.project.intercept_filter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/intercept")
public class InterceptController {

    @GetMapping(value ="/start/{num1}/{num2}")
    public String start(@PathVariable(name = "num1") String
                        num1,@PathVariable(name = "num2") String num2){
        return "Sum of the numbers you passed is " + (Integer.valueOf(num1)+Integer.valueOf(num2));
    }

}
