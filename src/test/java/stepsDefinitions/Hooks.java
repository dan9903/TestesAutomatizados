package stepsDefinitions;

import static utils.Utils.*;
import static utils.Utils.accessSystem;
import static utils.Utils.screenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {

  @Before(value = "not @login")
  public void setUp() {
    accessSystem();
    At(LoginPage.class).login("Admin", "admin123");
  }

  @Before(value = "@login")
  public void setUpLogin() {
    accessSystem();
  }

  @After
  public void tearDown(Scenario scenario) {
    screenshot(scenario);
    quitSystem();
  }
}
