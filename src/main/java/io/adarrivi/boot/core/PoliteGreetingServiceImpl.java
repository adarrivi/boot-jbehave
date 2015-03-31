package io.adarrivi.boot.core;


class PoliteGreetingServiceImpl implements GreetingService {

	PoliteGreetingServiceImpl() {
	}

	@Override
	public String getGreetings(String name) {
		if (name == null || name.isEmpty()) {
			return "Good morning, unidentified user";
		}
		return "Good morning dear " + name;
	}

}
