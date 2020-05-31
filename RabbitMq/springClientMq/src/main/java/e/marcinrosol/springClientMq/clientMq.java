package e.marcinrosol.springClientMq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientMq {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/receiveMessage")
    public String get(){
        Object eggs = rabbitTemplate.receiveAndConvert("eggs");
        return eggs.toString();
    }

    /*
    @RabbitListener(queues = "eggs")
    public void rabbitListener(String s){
        System.out.println(s);

    }

     */

}
