package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.PlayerPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class PlayerPageStepdefs {

    PlayerPage playerPage=new PlayerPage();

    @Given("user on the {string} player page")
    public void user_on_the_player_page(String heading) {
        String actualHeading =  Driver.waitForVisibility(playerPage.blueBillywigHeading,5).getText();
        assertTrue("Heading is NOT true",actualHeading.contains(heading));
    }

    @When("user clicks player container")
    public void userClicksPlayerContainer() {
        Driver.sleep(1000);
        Driver.waitAndClick(playerPage.playerContainer);
        Driver.sleep(1000);
    }

    @Then("user should see the HTML5 video element")
    public void userShouldSeeTheHTML5VideoElement() {
        boolean isPlayerDisplayed = Driver.waitForVisibility(playerPage.playerElement,5).isDisplayed();
        assertTrue("Player is NOT displayed",isPlayerDisplayed);
    }

    @When("user presses the {string} button")
    public void userPressesTheButton(String button) {
        switch(button){
            case "big play":
                Driver.clickWithJS(playerPage.bigPlayButton);
                Driver.sleep(3000);
                break;
            case "mute":
                Driver.clickWithJS(playerPage.playerMuteButton);
                Driver.sleep(1000);
                Actions actions=new Actions(Driver.getDriver());
                actions.sendKeys(Keys.PAGE_UP).perform();
                Driver.sleep(1000);
                break;
            default:
                System.out.println("No such a button");
                break;
        }

    }

    @Then("the video element enters the playing state")
    public void theVideoElementEntersThePlayingState() {
        Driver.sleep(1000);
        boolean isVideoPlaying = Driver.waitForVisibility(playerPage.playingState,5).isDisplayed();
        assertTrue("Video is NOT playing",isVideoPlaying);
        Driver.sleep(1000);
    }

    @Then("the video element is muted")
    public void theVideoElementIsMuted() {
        Driver.sleep(1000);
        boolean isVideoMuted = Driver.waitForVisibility(playerPage.mutedState,5).isDisplayed();
        assertTrue("Video is NOT muted",isVideoMuted);
    }

    @Then("the video element is muted when it is playing")
    public void theVideoElementIsMutedWhenItIsPlaying() {
        Driver.sleep(1000);
        boolean isVideoMuted = Driver.waitForVisibility(playerPage.playingMutedState,5).isDisplayed();
        assertTrue("Video is NOT muted",isVideoMuted);

    }

    @Then("the video element enters the playing state when it is muted")
    public void theVideoElementEntersThePlayingStateWhenItIsMuted() {
        Driver.sleep(1000);
        boolean isVideoPlaying = Driver.waitForVisibility(playerPage.mutedPlayingState,5).isDisplayed();
        assertTrue("Video is NOT playing",isVideoPlaying);
    }
}

