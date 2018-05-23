package com.blueinfinite2;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Msg2Sender {
    String OUTPUT = "blueinfinite_output";//若为blueinfinite_input，则配置文件不用作反向

    @Output(OUTPUT)
    MessageChannel output();
}
