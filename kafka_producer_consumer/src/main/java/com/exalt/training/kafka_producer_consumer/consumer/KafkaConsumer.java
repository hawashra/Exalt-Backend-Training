package com.exalt.training.kafka_producer_consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Service class for consuming Kafka messages.
 */
@Service
@Slf4j
public class KafkaConsumer {

    /**
     * Consumes messages from the "hamza-topic" Kafka topic.
     *
     * @param message the message to consume
     */
    @KafkaListener(topics = "hamza-topic", groupId = "group_id")
    public void consumeMessage(String message) {
        log.info(String.format("#### -> Consumed message -> %s", message));
        System.out.println("Consumed message: " + message);
    }
}