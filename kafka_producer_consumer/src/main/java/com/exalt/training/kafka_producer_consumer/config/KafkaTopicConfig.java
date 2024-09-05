package com.exalt.training.kafka_producer_consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Configuration class for Kafka topics.
 */
@Configuration
public class KafkaTopicConfig {

    /**
     * Creates a new Kafka topic named "hamza-topic".
     *
     * @return the new Kafka topic
     */
    @Bean
    public NewTopic hamzaTopic() {
        return TopicBuilder
                .name("hamza-topic")
                .build();
    }
}