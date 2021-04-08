
import com.mapyourown.lambda.SendSmsMessage;
import com.mapyourown.processType.LambdaProperties;
import org.apache.log4j.Logger;


/**
 * Local run starts the entire process like lambda itself
 */
public class SendSmsMessageLocalRun {
    private static final Logger logger = Logger.getLogger(SendSmsMessageLocalRun.class);
    private LambdaProperties properties = new LambdaProperties();

    public static void main (String[] args) throws Exception {
        SendSmsMessageLocalRun instance = new SendSmsMessageLocalRun();
        instance.run();
    }

    private void run() {
        SendSmsMessage processor = new SendSmsMessage();
        try {
           processor.run();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}