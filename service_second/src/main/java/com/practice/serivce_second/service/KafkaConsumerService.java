package com.practice.serivce_second.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "gikim", groupId = "group-id-gikim")
    public void consume(String message) {
        System.out.println("receive message : " + message);
    }
}
