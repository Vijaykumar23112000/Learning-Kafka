package com.magret.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.magret.constants.WikimediaConstants.WIKIMEDIA_TOPIC;

@Configuration
public class WikimediaTopicConfig {

    @Bean
    NewTopic wikimediaTopic(){
        return TopicBuilder
                .name(WIKIMEDIA_TOPIC)
                .build();
    }

}
