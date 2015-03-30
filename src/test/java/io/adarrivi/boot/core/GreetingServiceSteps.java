package io.adarrivi.boot.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class GreetingServiceSteps extends Steps {

	private GreetingService greetingService;
	private String userName;

	public GreetingServiceSteps(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@Given("a user name $userName")
	public void givenUserName(String userName) {
		this.userName = userName;
	}

	@When("generate greeting sentence")
	public void whenGenerateGreeting() {
		greetingService.getGreetings(userName);
	}

	@Then("greeting should be $greeting")
	public void thenGreetingShouldBe(String greeting) {
		assertThat(greeting, equalTo("Good morning, udentified user"));
	}
}
