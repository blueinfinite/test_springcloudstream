import com.blueinfinite2.AppRabbit;
import com.blueinfinite2.Receiver;
import com.blueinfinite2.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppRabbit.class)
public class AppRabbitTest {
    @Autowired
    private Sender sender;
    @Autowired
    private Receiver receiver;
    @Test
    public void hello() {
        sender.send();
    }


}
