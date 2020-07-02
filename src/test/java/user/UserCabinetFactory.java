package user;

import java.util.ResourceBundle;

public class UserCabinetFactory {
   public static ResourceBundle user= ResourceBundle.getBundle("user");

   public static UserCabinet getUserInfo(){
return new UserCabinet(user.getString("login"),user.getString("password"));

   }

}
