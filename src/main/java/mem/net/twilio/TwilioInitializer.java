package mem.net.twilio;

import com.twilio.Twilio;
import mem.net.twilio.config.TwilioConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {

    public TwilioInitializer(TwilioConfig tc) {
        Twilio.init(tc.getAccountSid(), tc.getAuthToken());
        Logger log = LoggerFactory.getLogger(TwilioInitializer.class);
        log.info("Twilio initialized... with account sid {} ", tc.getAccountSid());
    }
}
