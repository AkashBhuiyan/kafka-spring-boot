package com.akash.kafka.consumer;

import com.akash.kafka.constants.KafkaTopicsNameConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Author: akash
 * Date: 16/2/25
 */

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = KafkaTopicsNameConstants.SPORTS, groupId = "group1")
    public void consumeMessage(String message) {
        log.info("Consuming this message from '{}' topic = '{}'", KafkaTopicsNameConstants.SPORTS, message);
    }
}
