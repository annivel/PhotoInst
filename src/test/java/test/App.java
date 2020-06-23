package test;

import Helper.LoginHelper;
import Helper.SearchPageHelper;
import tools.Download;
import tools.SaveStep;
import tools.Scroll;

public class App {
    public LoginHelper login;
    public SearchPageHelper search;
    public Scroll scroll;
    public Download download;



    public App() {
        login = new LoginHelper();
        search = new SearchPageHelper();
        scroll = new Scroll();
        download = new Download();
    }

}
