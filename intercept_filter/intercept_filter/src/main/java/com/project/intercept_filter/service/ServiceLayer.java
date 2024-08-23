package com.project.intercept_filter.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

    public String returnSum(String num1 , String num2){
        System.out.println("Inside return Sum form ----> Service Layer");
        return "Sum of the numbers you passed is " + (Integer.valueOf(num1)+Integer.valueOf(num2));
    }

}
