package com.blueinfinite2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.util.Random;

@Slf4j
@EnableBinding(value={Msg2Sender.class,Msg2Receiver.class})
public class MySender {
    @Bean
    @InboundChannelAdapter(value = Msg2Sender.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource(){
        log.info("--------- timerMessageSource");

        return () -> new GenericMessage<>("{\"id\":"+new Random().nextInt()+",\"username\":\"suger\",\"password\":\"123456\"}");
    }

    @StreamListener(Msg2Receiver.INPUT)
    public void receiveFromOutput(Object payload) {
        log.info("MySender Received: "+payload);
        //return "接收到了："+System.currentTimeMillis();
    }

//    @Transformer(inputChannel = "input", outputChannel = "input")
//    public Object transform(String msg) {
//        log.info(" -- transform "+msg);
//        return msg;
//    }



}
