package com.blueinfinite;

import com.blueinfinite.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.annotation.rxjava.EnableRxJavaProcessor;
import org.springframework.messaging.handler.annotation.SendTo;

@Slf4j
//@EnableRxJavaProcessor
public class MyReceiverRXJava {

    public MyReceiverRXJava() {

        log.info("============= MyReceiver");
    }


//    @StreamListener(Sink.INPUT)
//    public void receive(User payload) {
//        log.info("Received: "+payload);
//    }

    @SendTo(Msg2Sender.OUTPUT)
    @StreamListener(Msg2Receiver.INPUT)
    public String receiveFromInput(User payload) {
        log.info("Received: "+payload);
        return payload.toString()+" 999999";
    }

//    @Transformer(inputChannel = "input", outputChannel = "input")
//    public User transform(String msg) throws IOException {
//        log.info("MyReceiver transform "+msg);
//        ObjectMapper objectMapper = new ObjectMapper();
//        User user = objectMapper.readValue(msg, User.class);
//        return user;
//    }
}
