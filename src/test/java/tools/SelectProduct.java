package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import producer.ProducerFactory;
import producer.ProducerName;

public class SelectProduct extends DriverPage {
	@FindBy(xpath="//a[@class='goods-tile__heading'and @href='https://rozetka.com.ua/168238960/p168238960/']")
	private WebElement sharkToy;

	@FindBy(xpath="//div[@class='goods-tile']//app-buy-button[@goods_id='168238960']")
	private WebElement putToBasket;

	@FindBy(xpath="//div[@modaloverlay='modal']//a[@class='button button_color_gray cart-modal__bottom-continue']")
	private WebElement shopContinue;

	public void setSharkToy(){
	    if (sharkToy.isDisplayed()){
            System.out.println(sharkToy.getText());
        }
    }

    public void setPutToBasket(){
	    putToBasket.click();
    }

    public void setShopContinue(){
	    if (shopContinue.isDisplayed()){
            shopContinue.click();
        }

    }

}
