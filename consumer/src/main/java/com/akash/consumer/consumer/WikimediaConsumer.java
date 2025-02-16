package com.akash.consumer.consumer;

import com.akash.consumer.constants.KafkaTopicsNameConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Author: akash
 * Date: 16/2/25
 */

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = KafkaTopicsNameConstants.WIKIMEDIA_STREAM, groupId = KafkaTopicsNameConstants.GROUP_ID)
    public void consumeMessage(String message) {
        log.info("Consuming this message from '{}' topic = '{}'", KafkaTopicsNameConstants.WIKIMEDIA_STREAM, message);
        // do anything with the data
    }
}
