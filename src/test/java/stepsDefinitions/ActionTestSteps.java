package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.At;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class ActionTestSteps {
  @When("I access the custom fields Menu")
  public void iAccessTheCustomFieldsMenu() {
    At(HomePage.class).accessMenuCustomFields();
  }

  @Then("the system will be show the custom fields page.")
  public void theSystemWillBeShowTheCustomFieldsPage() {
    assertEquals("Add Custom Field", At(HomePage.class).getElementValueById("heading"));
  }

}
