package com.magret.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaStringProducer {

    private final KafkaTemplate<String , String> kafkaTemplate;

    public void sendMessage(String msg){
       log.info(String.format("Sending Message to myTopic :: %s",msg));
        kafkaTemplate.send("myTopic",msg);
    }

}
