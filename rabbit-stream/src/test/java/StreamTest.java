import com.blueinfinite.AppStream;
import com.blueinfinite.Msg2Sender;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppStream.class)
@WebAppConfiguration
public class StreamTest {
    @Autowired
    private Msg2Sender msg2Sender;


//    @Qualifier("output")
//    @Autowired
    private MessageChannel output222;

    @Test
    public void sender() {
        msg2Sender.output().send(MessageBuilder.withPayload("From Msg2Sender").build());
    }

    @Test
    public void sender2() {
        output222.send(MessageBuilder.withPayload("From Msg2Sender1111111").build());
    }
}
