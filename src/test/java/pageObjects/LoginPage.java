package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

  @FindBy(name = "txtUsername")
  private WebElement usernameField;

  // @FindBy(css = "[id=txtUsername]")

  @FindBy(name = "txtPassword")
  private WebElement passwordField;

  @FindBy(name = "Submit")
  private WebElement loginButton;

  @FindBy(id = "welcome")
  private WebElement welcomeMessage;

  @FindBy(id = "spanMessage")
  private WebElement errorMessage;

  @FindBy(linkText = "Forgot your password?")
  private WebElement forgotPasswordLink;

  // @FindBy(xpath = "//span[contains(text(), '( Username : Admin | Password :
  // admin123 )')]")
  // private WebElement hintAuthentication;

  public void informUserField(String username) {
    usernameField.sendKeys(username);
  }

  public void informPasswordField(String password) {
    passwordField.sendKeys(password);
  }

  public void clickLoginButton() {
    loginButton.click();
  }

  public String getWelcomeMessage() {
    return welcomeMessage.getText();
  }

  public String getLoginErrorMessage() {
    return errorMessage.getText();
  }

  public String login(String username, String password) {
    informUserField(username);
    informPasswordField(password);
    clickLoginButton();
    String message = getWelcomeMessage();
    return (message != null) ? message : getLoginErrorMessage();
  }

}
