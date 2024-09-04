package com.exalt.training.kafka_producer_consumer.controller;

import com.exalt.training.kafka_producer_consumer.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for handling message-related requests.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/messages")
public class MessageController {

    // KafkaProducer for sending messages to Kafka topics
    private final KafkaProducer kafkaProducer;

    /**
     * Endpoint for sending a message to the Kafka topic.
     *
     * @param message the message to send
     * @return a response entity indicating the result
     */
    @PostMapping
    public ResponseEntity<String> sendMessage(
            @RequestBody String message
    ) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent successfully!");
    }
}