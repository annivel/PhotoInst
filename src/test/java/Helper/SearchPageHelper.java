package Helper;

import accountInfo.ProfileInfo;
import tools.SearchPage;

public class SearchPageHelper extends SearchPage {
    public void searchProfile (String profile){
        search(profile);
        findAccount();

    }
    public void searchProfile (ProfileInfo profileInfo){
        searchProfile(profileInfo.profile);
    }

}
