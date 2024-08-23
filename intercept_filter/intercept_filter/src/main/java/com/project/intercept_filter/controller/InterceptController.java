package com.project.intercept_filter.controller;

import com.project.intercept_filter.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
@RequestMapping(value = "/intercept")
public class InterceptController {

    @Autowired
    private ServiceLayer service;

    @GetMapping(value ="/start/{num1}/{num2}")
    public String start(@PathVariable(name = "num1") String
                        num1,@PathVariable(name = "num2") String num2){
        System.out.println("Inside controller layer");
        return service.returnSum(num1,num2);
    }

     @GetMapping(value ="/start2/{num1}/{num2}")
        public String start2(@PathVariable(name = "num1") String
                            num1,@PathVariable(name = "num2") String num2){
            System.out.println("Inside controller layer");
            return service.returnSum(num1,num2);
    }

    @GetMapping(value ="/start3/{num1}/{num2}")
        public String start3(@PathVariable(name = "num1") String
                            num1,@PathVariable(name = "num2") String num2){
            System.out.println("Inside controller layer");
            return service.returnSum(num1,num2);
    }

}
