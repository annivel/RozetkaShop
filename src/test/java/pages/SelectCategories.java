package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tools.DriverPage;

public class SelectCategories extends DriverPage {
    @FindBy(xpath = "//button[@class='menu-toggler']")
    private WebElement catalogItems;

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/kids/c88468/']")
    private WebElement kidsItem;

    @FindBy(xpath = "//li/a[@href='https://rozetka.com.ua/soft_toys/c99051/' and @class='menu__link']")
    private WebElement softToys;


    public void setCatalogItems() {
      /*wait.until(ExpectedConditions.elementToBeClickable(catalogItems));*//*

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", catalogItems);
        catalogItems.click();*/
/*    wait.until(ExpectedConditions.visibilityOf(catalogItems));
          catalogItems.click();*/
try {
    catalogItems.click();
}catch (WebDriverException e){
    JavascriptExecutor executor=(JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click()",catalogItems);
}
      }


    public void moveToElementKidsItem() {
        Actions actions = new Actions(driver);
        actions.moveToElement(kidsItem).release().build().perform();
    }

    public void setSoftToys() throws InterruptedException {
        /*        wait.until(ExpectedConditions.elementToBeClickable(softToys));*/
       /* Actions actions = new Actions(driver);
        actions.moveToElement(softToys).release().build().perform();*/
      Thread.sleep(2000);
           softToys.click();
       }

    }

