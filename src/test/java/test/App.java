package test;

import helpers.*;

public class App {
    public RegistrationHelper registration;
    public LoginPageHelper login;
    public SelectCategoriesHelper selectCategories;
    public CheckBoxHelper checkBoxSearch;
    public SelectProdHelper selectToy;
    public BasketHelper basketVerify;





    public App() {
        login = new LoginPageHelper();
        registration = new RegistrationHelper();
        selectCategories= new SelectCategoriesHelper();
        checkBoxSearch= new CheckBoxHelper();
        selectToy= new SelectProdHelper();
        basketVerify=new BasketHelper();
    }
}
