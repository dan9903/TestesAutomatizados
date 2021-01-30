package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

  @FindBy(id = "btnAdd")
  private WebElement btnAdd;

  public void clickOnAddUser() {
    btnAdd.click();
  }

  public boolean hasUserElement(String username) {
    return driver.findElement(By.xpath("//a[text()='" + username + "']")).isDisplayed();
  }

  public String getElementValueById(String id) {
    return driver.findElement(By.id(id)).getText();
  }

  public void accessMenuCustomFields() {
    moveMouseToPIMTab();
    moveMouseToConfigurationMenu();
    moveMouseToCustomFieldsMenu();
    click();
  }
}