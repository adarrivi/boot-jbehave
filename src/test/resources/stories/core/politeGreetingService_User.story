Scenario: No user name provided when logging into the web service

Given a user name Ronald
When generate greeting sentence
Then greeting should be Good morning dear Ronald