package com.org.cobro.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.cobro.model.Car;
import com.org.cobro.services.MySOAPServiceClient;
import org.apache.commons.text.StringSubstitutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class HelloController {
    Logger logger = LogManager.getLogger(HelloController.class);
    
    @RequestMapping("/")
    String hellow() {
        StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
        String text = interpolator.replace(
                "Base64 Decoder:        ${base64Decoder:SGVsbG9Xb3JsZCE=}\n" +
                        "Base64 Encoder:        ${base64Encoder:HelloWorld!}\n");

        logger.info(text);
        logger.info("Dentro de la app maintest");
        MySOAPServiceClient mySOAPServiceClient = new MySOAPServiceClient();
        logger.info(mySOAPServiceClient.invokeSOAPService(""));
        return "Hello World!";
    }

    @RequestMapping("/procesa")
    String procesa() {
        return "Procesado Terminado test version 2!";
    }

    @RequestMapping("/getStatus")
    String getStatus() {
        return "success";
    }

    @RequestMapping("/getVersion")
    String getVersion() {
    try {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "renault");
        objectMapper.writeValue(new File("target/car.json"), car);
        String carAsString = objectMapper.writeValueAsString(car);
        System.out.println(carAsString);
    } catch (Exception e) {
        System.out.println("termino");
    }
        return "version 1.2.3";
    }
}
