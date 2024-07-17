package com.magret.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WikimediaProducer {

    private final KafkaTemplate<String , String> kafkaTemplate;

    public void sendMessage(String msg){

        kafkaTemplate.send("wikimedia-stream",msg);

    }

}
