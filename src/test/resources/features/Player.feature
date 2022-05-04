Feature: Blue Billywig Player


  Background:
    Given user on the "Blue Billywig" player page
    When user clicks player container
    Then user should see the HTML5 video element

  @TC01
  Scenario:TC01 the HTML5 video element enters the playing state when the big play button in the center of the player is pressed
    When user presses the "big play" button
    Then the video element enters the playing state

  @TC02
  Scenario:TC02 the HTML5 video element toggles it's muted state when the mute button is pressed
    When user presses the "mute" button
    Then the video element is muted

  @TC03
  Scenario:TC03 the HTML5 video element should be muted when the mute button is pressed after it enters the playing state
    When user presses the "big play" button
    And user presses the "mute" button
    Then the video element is muted when it is playing

  @TC04
  Scenario:TC04 the HTML5 video element enters the playing state when the big play button is pressed after it is muted
    When user presses the "mute" button
    And user presses the "big play" button
    Then the video element enters the playing state when it is muted