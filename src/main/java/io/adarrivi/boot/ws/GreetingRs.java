package io.adarrivi.boot.ws;

public class GreetingRs {

	private Long id;
	private String content;

	public GreetingRs(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
