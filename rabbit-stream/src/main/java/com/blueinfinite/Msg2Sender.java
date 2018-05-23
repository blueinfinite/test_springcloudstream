package com.blueinfinite;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface Msg2Sender {
    String OUTPUT = "blueinfinite_output";

    @Output(OUTPUT)
    MessageChannel output();
}
