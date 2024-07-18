package com.magret.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.magret.constants.WikimediaConstants.WIKIMEDIA_TOPIC;

@Service
@RequiredArgsConstructor
public class WikimediaProducer {

    private final KafkaTemplate<String , String> kafkaTemplate;

    public void sendMessage(String msg){

        kafkaTemplate.send(WIKIMEDIA_TOPIC,msg);

    }

}
