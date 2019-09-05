package mem.net.twilio.service;

import mem.net.twilio.model.SmsRequest;

public interface SmsSender {
    void sendSms(SmsRequest smsReq);
}
