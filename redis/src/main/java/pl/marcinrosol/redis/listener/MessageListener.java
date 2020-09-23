package pl.marcinrosol.redis.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @ServiceActivator(inputChannel = "inputChannel")
    public Message<?> receiveFromService(Message<?> message){
        System.out.println("Recieve message");
        return message;
    }
}
