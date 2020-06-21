package pl.marcinrosol.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lol")
public class MessagePublisher {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;



    @GetMapping("/{message}")
    public void addMessage(@PathVariable String message){
        System.out.println(message);
        kafkaTemplate.send("nazwa", message);
    }
}
