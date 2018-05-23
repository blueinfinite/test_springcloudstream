package com.blueinfinite2;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello2", containerFactory = "rabbitListenerContainerFactory")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : "+hello);
    }

}
