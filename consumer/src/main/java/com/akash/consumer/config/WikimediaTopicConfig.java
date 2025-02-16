package com.akash.consumer.config;

import com.akash.consumer.constants.KafkaTopicsNameConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Author: akash
 * Date: 16/2/25
 */

@Configuration
public class WikimediaTopicConfig {
    @Bean
    public NewTopic wikimediaStreamTopic() {
        return TopicBuilder
                .name(KafkaTopicsNameConstants.WIKIMEDIA_STREAM)
                .build();
    }
}
