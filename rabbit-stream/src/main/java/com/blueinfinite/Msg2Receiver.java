package com.blueinfinite;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface Msg2Receiver {
    String INPUT = "blueinfinite_input";

    @Input(INPUT)
    SubscribableChannel input();
}
