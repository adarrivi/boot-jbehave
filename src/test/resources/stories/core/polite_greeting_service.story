Scenario: No user name provided, expects default greeting

Given user name <userName>
When greeting
Then greeting should be <greeting>

Examples:
|userName|greeting|
||Good morning, unidentified user|

Scenario: User name provided, expects customized greeting

Given user name <userName>
When greeting
Then greeting should be <greeting>

Examples:
|userName|greeting|
|a|Good morning dear a|
|Peter|Good morning dear Peter|
|234axX|Good morning dear 234axX|