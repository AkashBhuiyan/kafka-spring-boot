package com.akash.kafka.producer;

import com.akash.kafka.constants.KafkaTopicsNameConstants;
import com.akash.kafka.payload.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Author: akash
 * Date: 16/2/25
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaJsonProducer {

    private final KafkaTemplate<String, Employee> kafkaTemplate;

    public void sendMessage(Employee employee) {
        log.info("Sending message to '{}' topic ='{}'", KafkaTopicsNameConstants.EMPLOYEE_INFO, employee.toString());
        Message<Employee> message = MessageBuilder
                .withPayload(employee)
                .setHeader(KafkaHeaders.TOPIC, KafkaTopicsNameConstants.EMPLOYEE_INFO)
                .build();

        kafkaTemplate.send(message);
    }
}
