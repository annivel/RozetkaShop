package helpers;

import pages.SelectCategories;

public class SelectCategoriesHelper extends SelectCategories {

    public void selectCategories() throws InterruptedException {

        setCatalogItems();
        moveToElementKidsItem();
        setSoftToys();
    }
}
