package pl.marcinrosol.redis;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface MessageGateway {

    @Gateway(replyChannel = "inputChannel")
    public <S> void sendMessage(S request);

}
