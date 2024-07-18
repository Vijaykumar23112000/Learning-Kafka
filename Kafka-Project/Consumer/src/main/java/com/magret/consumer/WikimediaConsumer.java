package com.magret.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.magret.constants.WikimediaConstants.WIKIMEDIA_TOPIC;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = WIKIMEDIA_TOPIC , groupId = "wikimedia")
    public void consumeMessage(String msg){
        log.info(String.format("Consuming Message from wikimedia Topic :: %s" , msg));
    }

}
