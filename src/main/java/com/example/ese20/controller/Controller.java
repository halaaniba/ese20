package com.example.ese20.controller;

import com.example.ese20.sevice.ExpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ExpService exponentService;

    Logger logger = LoggerFactory.getLogger(Controller.class);


    @GetMapping("/")
    public String welcome() {
        String message = "Welcome";
        logger.info(message);
        return message;
    }

    @GetMapping("/exp")
    public int getExponent() {
        return exponentService.exponent();
    }

    @GetMapping("/get-errors")
    public String getError() {
        String message = "Error!";
        Error error = new Error("This is a error ");
        logger.error("Attention : " + error);
        return message;
    }
}
