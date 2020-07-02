package tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckBoxField extends DriverPage{
	@FindBy(xpath="//div[@class='sidebar-block']//input[@type='search']")
	private WebElement searchField;
	@FindBy(xpath="//a[@class='checkbox-filter__link']//label[contains(text(),'IKEA')]")
	private WebElement selectProducer;

	public void setSearchField(String producer){
	    wait.until(ExpectedConditions.visibilityOf(searchField));
	    searchField.sendKeys(producer);

    }
    public void setSelectProducer(){
		if (selectProducer.isDisplayed()){
			selectProducer.click();
		}

    }


}
