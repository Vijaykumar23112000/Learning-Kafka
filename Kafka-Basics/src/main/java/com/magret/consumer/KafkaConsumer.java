package com.magret.consumer;

import com.magret.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "myTopic" , groupId = "myGroup")
    public void consumeJsonMessage(Student student){
        log.info(String.format("Consuming the message from myTopic :: %s",student.toString()));
    }

}
