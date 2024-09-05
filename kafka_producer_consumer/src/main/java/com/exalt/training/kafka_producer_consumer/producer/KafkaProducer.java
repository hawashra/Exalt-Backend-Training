package com.exalt.training.kafka_producer_consumer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Service class for producing Kafka messages.
 */
@RequiredArgsConstructor
@Service
@Slf4j
public class KafkaProducer {

    // KafkaTemplate for sending messages to Kafka topics
    private final KafkaTemplate<String, String> kafkaTemplate;

    /**
     * Sends a message to the "hamza-topic" Kafka topic.
     *
     * @param message the message to send
     */
    public void sendMessage(String message) {
        log.info(String.format("#### -> Producing message -> %s", message));
        kafkaTemplate.send("hamza-topic", message);
    }
}