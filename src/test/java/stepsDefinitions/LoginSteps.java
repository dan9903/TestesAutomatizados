package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.At;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {

  @When("I inform the user {string}")
  public void iInformTheUser(String username) {
    At(LoginPage.class).informUserField(username);
  }

  @When("enter the password {string}")
  public void enterThePassword(String password) {
    At(LoginPage.class).informPasswordField(password);
  }

  @When("click the login button")
  public void clickTheLoginButton() {
    At(LoginPage.class).clickLoginButton();
  }

  @Then("the system shows the invalid user message")
  public void theSystemShowsTheInvalidUserMessage() {
    assertEquals("Invalid credentials", At(LoginPage.class).getLoginErrorMessage());
  }

  @Then("the system shows the logged user")
  public void theSystemShowsTheLoggedUser() {
    assertEquals("Welcome Paul", At(LoginPage.class).getWelcomeMessage());
  }

}
