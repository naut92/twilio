package mem.net.twilio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class SmsRequest {
    @NotBlank
    private final String phoneNumber;
    @NotBlank
    private final String message;
}
