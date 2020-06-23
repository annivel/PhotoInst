package accountInfo;

import java.util.ResourceBundle;

public class ProfileInfoFactory {
    private static ResourceBundle profile = ResourceBundle.getBundle("profile");

    public static ProfileInfo profileInfo(){
        return new ProfileInfo(profile.getString("profile"));
    }


}
