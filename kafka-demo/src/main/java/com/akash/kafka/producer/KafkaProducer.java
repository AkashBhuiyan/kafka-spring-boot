package com.akash.kafka.producer;

import com.akash.kafka.constants.KafkaTopicsNameConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Author: akash
 * Date: 15/2/25
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Sending message to '{}' topic ='{}'", KafkaTopicsNameConstants.SPORTS, message);
        kafkaTemplate.send(KafkaTopicsNameConstants.SPORTS, message);
    }
}
