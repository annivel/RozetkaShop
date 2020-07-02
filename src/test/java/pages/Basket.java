package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tools.DriverPage;

public class Basket extends DriverPage {
	@FindBy(xpath="//div[@class='js-rz-cart']")
	private WebElement basket;

	@FindBy(xpath="//p[@class='header-cart__bottom']")
	private WebElement toShopList;

	@FindBy(xpath="//div[@class='cart-modal__content']/a[@href='https://rozetka.com.ua/168238960/p168238960/']")
	private WebElement productInBasket;
	//a[@class='goods-tile__heading'and @href='https://rozetka.com.ua/168238960/p168238960/'

	public void setBasket(){
		Actions actions = new Actions(driver);
		actions.moveToElement(basket).release().build().perform();

		}

		public void toShopList(){
		toShopList.click();

		}

    public String setProductInBasket(){
		wait.until(ExpectedConditions.visibilityOf(productInBasket));
		return productInBasket.getText();
    }


}
