package mem.net.twilio;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TwilioApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(TwilioApplication.class).run(args);
	}

}
