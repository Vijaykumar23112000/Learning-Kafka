package com.magret.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "myTopic" , groupId = "myGroup")
    public void consumeMessage(String msg){
        log.info(String.format("Consuming the message from myTopic :: %s",msg));
    }

}
