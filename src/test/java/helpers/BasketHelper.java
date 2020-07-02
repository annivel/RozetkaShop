package helpers;

import pages.Basket;

public class BasketHelper extends Basket {

    public void VerifyBasket(){
        setBasket();
        toShopList();
        setProductInBasket();
    }
}
