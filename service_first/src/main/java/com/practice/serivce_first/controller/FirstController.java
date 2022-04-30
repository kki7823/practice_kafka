package com.practice.serivce_first.controller;

import com.practice.serivce_first.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    private final KafkaProducerService service;

    @Autowired
    public FirstController(KafkaProducerService service) {
        this.service = service;
    }

    @PostMapping("/practice")
    public void sendMessage(String message){
        service.sendMessage(message);
    }
}
