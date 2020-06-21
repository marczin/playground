package pl.marcinrosol.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageConsumer {

    @KafkaListener(topics = "nazwa", groupId = "1")
    public void listener(String message){
        System.out.println(message);
    }

}
