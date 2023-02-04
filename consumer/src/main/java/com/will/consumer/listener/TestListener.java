package com.will.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestListener {

    @KafkaListener(topics = "topic-1", groupId = "group-1")
    public void listener(String message) {
        log.info("Thread: {}", Thread.currentThread().getId());
        log.info("Received: {}", message);
    }
}
