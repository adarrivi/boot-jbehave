package io.adarrivi.boot.core;


class PoliteGreetingServiceImpl implements GreetingService {

	PoliteGreetingServiceImpl() {
	}

	@Override
	public String getGreetings(String name) {
		return "Good morning dear " + name;
	}

}
