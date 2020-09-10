package me.marczin.socket.socket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {



    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage messgae) throws Exception{
        Thread.sleep(1000);
        return new Greeting(
                "hello "+ HtmlUtils.htmlEscape(messgae.getName()));
    }


}
