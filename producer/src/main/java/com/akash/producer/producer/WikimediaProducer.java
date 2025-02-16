package com.akash.producer.producer;

import com.akash.producer.constants.KafkaTopicsNameConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Author: akash
 * Date: 16/2/25
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        //log.info("Sending message to '{}' topic ='{}'", KafkaTopicsNameConstants.WIKIMEDIA_STREAM, message);
        kafkaTemplate.send(KafkaTopicsNameConstants.WIKIMEDIA_STREAM, message);
    }
}
