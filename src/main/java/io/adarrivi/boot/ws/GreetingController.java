package io.adarrivi.boot.ws;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws")
public class GreetingController {

	private static final AtomicLong RQ_COUNTER = new AtomicLong();
	private static final String TEMPLATE = "Hello, %s!";

	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public GreetingRs sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		return new GreetingRs(RQ_COUNTER.incrementAndGet(), String.format(TEMPLATE, name));
	}

}
