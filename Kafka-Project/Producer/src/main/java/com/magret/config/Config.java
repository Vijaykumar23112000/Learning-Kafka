package com.magret.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Config {

    @Bean
    NewTopic wikimediaTopic(){
        return TopicBuilder
                .name("wikimedia-stream")
                .build();
    }

}
