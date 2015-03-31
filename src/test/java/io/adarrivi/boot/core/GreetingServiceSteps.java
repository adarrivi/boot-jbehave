package io.adarrivi.boot.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class GreetingServiceSteps extends Steps {

	private GreetingService greetingService;
	private String userName;
	private String greetings;

	public GreetingServiceSteps(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@Given("user name <userName>")
	public void givenUserName(@Named("userName") String userName) {
		this.userName = userName;
	}

	@When("greeting")
	public void whenGenerateGreeting() {
		greetings = greetingService.getGreetings(userName);
	}

	@Then("greeting should be <greeting>")
	public void thenGreetingShouldBe(@Named("greeting") String greeting) {
		assertThat(greeting, equalTo(this.greetings));
	}
}
