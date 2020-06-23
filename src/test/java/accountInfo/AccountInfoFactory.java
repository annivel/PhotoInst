package accountInfo;

import java.util.ResourceBundle;

public class AccountInfoFactory {
    private static ResourceBundle account = ResourceBundle.getBundle("account");

    public static AccountInfo getValidAccount() {
        return new AccountInfo(account.getString("login"),
                account.getString("password"));
    }
}
