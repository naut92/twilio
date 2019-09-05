package mem.net.twilio.service.impl;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import mem.net.twilio.config.TwilioConfig;
import mem.net.twilio.model.SmsRequest;
import mem.net.twilio.service.SmsSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsSenderImpl implements SmsSender {
    private final TwilioConfig config;
    private final Logger log = LoggerFactory.getLogger(TwilioSmsSenderImpl.class);

    public TwilioSmsSenderImpl(TwilioConfig tc) {
        this.config = tc;
    }

    @Override
    public void sendSms(SmsRequest smsReq) {
        if (isPhoneNumberValid(smsReq.getPhoneNumber())){
            PhoneNumber to = new PhoneNumber(smsReq.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(config.getTrialNumber());
            String message = smsReq.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            log.info("Send sms {} " + smsReq);
        } else {
            throw new IllegalArgumentException("Phone number [" + smsReq.getPhoneNumber() + "] is not a valid number");
        }
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        //TODO: Implement phone number validator
        return true;
    }
}
