package mem.net.twilio.controller;

import mem.net.twilio.model.SmsRequest;
import mem.net.twilio.service.SmsSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class SmsController {
    private final SmsSender sender;

    public SmsController(SmsSender s) {
        this.sender = s;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest){
        sender.sendSms(smsRequest);
    }
}
