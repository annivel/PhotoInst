package Helper;

import accountInfo.AccountInfo;
import instPages.LoginPage;

public class LoginHelper extends LoginPage {

public void setLogin (String login, String password){
    typeUsername(login);
    typePassword(password);
    clickEnter();
}
public void  setLogin(AccountInfo account){
    setLogin(account.login,account.password);
}
}
