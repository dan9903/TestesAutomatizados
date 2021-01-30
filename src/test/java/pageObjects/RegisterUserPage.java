package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUserPage {
  @FindBy(id = "systemUser_employeeName_empName")
  private WebElement employeeNameField;
  @FindBy(id = "systemUser_userName")
  private WebElement usernameField;
  @FindBy(id = "systemUser_password")
  private WebElement passwordField;
  @FindBy(id = "systemUser_confirmPassword")
  private WebElement confirmPasswordField;
  @FindBy(id = "btnSave")
  private WebElement saveButton;

  public void setEmployeeNameField(String employeeName) {
    employeeNameField.sendKeys(employeeName);
  }

  public void setUsernameField(String username) {
    usernameField.sendKeys(username);
  }

  public void setPasswordField(String password) {
    passwordField.sendKeys(password);
  }

  public void setConfirmPasswordField(String confirmPassword) {
    confirmPasswordField.sendKeys(confirmPassword);
  }

  public void clickSaveButton() {
    saveButton.click();
  }
}
