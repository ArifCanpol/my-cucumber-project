package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PlayerPage {

    public PlayerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="bb-wr-default-2575390")
    public WebElement playerElement;

    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement bigPlayButton;

    @FindBy(xpath = "(//*[@role='button'])[2]")
    public WebElement smallPlayButton;

    @FindBy(xpath = "(//*[@role='button'])[3]")
    public WebElement playerMuteButton;

    @FindBy(xpath = "(//*[@role='button'])[4]")
    public WebElement playerSettingsButton;

    @FindBy(xpath = "(//*[@role='button'])[5]")
    public WebElement videoShareButton;

    @FindBy(xpath = "(//*[@role='button'])[6]")
    public WebElement shareFacebookButton;

    @FindBy(xpath = "(//*[@role='button'])[7]")
    public WebElement shareTwitterButton;

    @FindBy(xpath = "(//*[@role='button'])[8]")
    public WebElement shareLinkedinButton;

    @FindBy(xpath = "(//*[@role='button'])[9]")
    public WebElement shareEmbedCodeButton;

    @FindBy(xpath = "(//*[@role='button'])[10]")
    public WebElement playerBigScreenButton;

    @FindBy(xpath = "(//a[.='Player'])")
    public WebElement playerContainer;

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement bearLogo;

    @FindBy(xpath = "//h1")
    public WebElement blueBillywigHeading;

    @FindBy(xpath = "//img[@alt='Bears']")
    public WebElement imageBears;

    @FindBy(xpath = "//*[@class='bb-layer bb-skin-layer bb-phase-main bb-mode-video bb-state-playing']")
    public WebElement playingState;

    @FindBy(xpath = "//*[@class='bb-layer bb-skin-layer bb-phase-init bb-mode-video bb-state-paused bb-muted']")
    public WebElement mutedState;

    @FindBy(xpath = "//*[@class='bb-layer bb-skin-layer bb-phase-main bb-mode-video bb-state-playing bb-muted']")
    public WebElement playingMutedState;

    @FindBy(xpath = "//*[@class='bb-layer bb-skin-layer bb-muted bb-phase-main bb-mode-video bb-state-playing']")
    public WebElement mutedPlayingState;



}

