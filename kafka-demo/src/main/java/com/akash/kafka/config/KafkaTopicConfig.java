package com.akash.kafka.config;

import com.akash.kafka.constants.KafkaTopicsNameConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Author: akash
 * Date: 15/2/25
 */

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic sportsTopic() {
        return TopicBuilder
                .name(KafkaTopicsNameConstants.SPORTS)
                .build();
    }
}
