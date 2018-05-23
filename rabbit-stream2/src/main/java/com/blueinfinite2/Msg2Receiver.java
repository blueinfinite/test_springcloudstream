package com.blueinfinite2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface Msg2Receiver {
    String INPUT = "blueinfinite_input";//若为blueinfinite_output，则配置文件不用作反向

    @Input(INPUT)
    SubscribableChannel input();
}
