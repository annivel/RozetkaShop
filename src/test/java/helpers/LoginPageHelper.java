package helpers;

import pages.LoginPage;
import user.UserCabinet;

public class LoginPageHelper extends LoginPage {
    public void setLogin(String login, String password) {
        login(login);
        password(password);
     /*   submit();*/
    }

    public void setLogin(UserCabinet cabinet) {
        setLogin(cabinet.login, cabinet.password);
    }

}
