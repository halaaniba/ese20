package com.example.ese20.sevice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExpService {

    Logger logger = LoggerFactory.getLogger(ExpService.class);

    @Value("${custom.variable1}")
    private int customVariable1;

    @Value("${custom.variable2}")
    private int customVariable2;

    public int exponent() {
        logger.info("exponent calculation");
        int result = (int) Math.pow(customVariable1, customVariable2);
        logger.info("end of exponent calculation: {}", result);
        return result;
    }

}

