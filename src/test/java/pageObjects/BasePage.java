package pageObjects;

import static utils.Utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BasePage {

  protected Actions action;

  @FindBy(linkText = "Admin")
  protected WebElement adminTab;

  @FindBy(linkText = "PIM")
  protected WebElement pimTab;

  @FindBy(id = "menu_pim_Configuration")
  protected WebElement configurationMenu;

  @FindBy(id = "menu_pim_listCustomFields")
  protected WebElement customFieldsMenu;

  public BasePage() {
    action = new Actions(driver);
  }

  public void clickOnAdminTab() {
    adminTab.click();
  }

  public void clickOnPIMTab() {
    pimTab.click();
  }

  public void moveMouseToPIMTab() {
    action.moveToElement(pimTab).build().perform();
  }

  public void moveMouseToConfigurationMenu() {
    action.moveToElement(configurationMenu).build().perform();
  }

  public void moveMouseToCustomFieldsMenu() {
    action.moveToElement(customFieldsMenu).build().perform();
  }

  public void click() {
    action.click().build().perform();
  }

}