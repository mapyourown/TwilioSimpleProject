
package com.mapyourown.lambda;
import com.mapyourown.processType.LambdaProperties;
import org.apache.log4j.Logger;

import java.io.IOException;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSmsMessage {
    //A simple send class to send an sms to a specif number
    private static final Logger logger = Logger.getLogger(SendSmsMessage.class);

    private LambdaProperties properties = new LambdaProperties();
    public void run() throws Exception{
        try {
            processSms();
        } catch (IOException e){
            logger.info(e.getMessage());
        }
    }

    private void processSms() throws Exception {
        try {
            Twilio.init(properties.getAccountId(), properties.getAuthToken());
            Message message = Message.creator(
                    new PhoneNumber("phone number your want to send"),
                    new PhoneNumber(properties.getTwilioPhone()), //it get your twilio phone you provisioned
                    "This is a test message")
                    .create();
            System.out.println(message.getSid());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}