package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.At;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterUserPage;

public class RegisterUserSteps {
  @When("I click on the Admin tab")
  public void iClickOnTheAdminTab() {
    At(HomePage.class).clickOnAdminTab();
  }

  @When("click on the add button")
  public void clickOnTheAddButton() {
    At(HomePage.class).clickOnAddUser();
  }

  @When("inform the Employee Name field the value {string}")
  public void informTheEmployeeNameFieldTheValue(String employeeName) {
    At(RegisterUserPage.class).setEmployeeNameField(employeeName);
  }

  @When("inform the UserName field the value {string}")
  public void informTheUserNameFieldTheValue(String username) {
    At(RegisterUserPage.class).setUsernameField(username);
  }

  @When("inform the Password field the value {string}")
  public void informThePasswordFieldTheValue(String password) {
    At(RegisterUserPage.class).setPasswordField(password);

  }

  @When("inform the Confirm Password field the value {string}")
  public void informTheConfirmPasswordFieldTheValue(String password) {
    At(RegisterUserPage.class).setConfirmPasswordField(password);
  }

  @When("click in the Save button")
  public void clickInTheSaveButton() {
    At(RegisterUserPage.class).clickSaveButton();
  }

  @Then("the system will be save the user {string}")
  public void theSystemWillBeSaveTheUser(String username) {
    At(HomePage.class).clickOnAdminTab();
    assertTrue(At(HomePage.class).hasUserElement(username));
  }

}
