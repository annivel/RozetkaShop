package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainStep extends SetUp {
    @Test
    public void RozetkaShop() throws InterruptedException {
        app.registration.setRegistrationWindow();
        app.login.setLogin(cabinet);
        app.selectCategories.selectCategories();
        app.checkBoxSearch.checkBoxSelect(producerName);
        app.selectToy.selectProduct();
        app.basketVerify.VerifyBasket();
        Assert.assertEquals(app.basketVerify.setProductInBasket(), producerName.item);

    }
}
