package com.akash.kafka.consumer;

import com.akash.kafka.constants.KafkaTopicsNameConstants;
import com.akash.kafka.payload.Employee;
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

    @KafkaListener(topics = KafkaTopicsNameConstants.SPORTS, groupId = KafkaTopicsNameConstants.GROUP_ID)
    public void consumeMessage(String message) {
        log.info("Consuming this message from '{}' topic = '{}'", KafkaTopicsNameConstants.SPORTS, message);
    }

    @KafkaListener(topics = KafkaTopicsNameConstants.EMPLOYEE_INFO, groupId = KafkaTopicsNameConstants.GROUP_ID)
    public void consumeJsonMessage(Employee employee) {
        log.info("Consuming this message from '{}' topic = '{}'", KafkaTopicsNameConstants.SPORTS, employee.toString());
    }
}
