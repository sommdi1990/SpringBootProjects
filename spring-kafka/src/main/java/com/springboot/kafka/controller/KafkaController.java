package com.springboot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private static final String TOPIC = "test-topic";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/publish")
    public Map<String, String> publishMessage(@RequestBody Map<String, String> message) {
        kafkaTemplate.send(TOPIC, message.get("message"));
        Map<String, String> response = new HashMap<>();
        response.put("status", "Message published successfully");
        return response;
    }
}

