package util;

/**
 * Created by r.singhbhasin on 09/07/2014.
 */
public class Constants {
    //paths
    public static String CONFIG_FILE_PATH = System.getProperty("user.dir") + "//src//test//java//config//config.properties";


    //URL's
    public static String Coll_url="http://test-www.nature.com/collections/whdszl";

    // Nature log-ins
    public static String usrname="r.singhbhasin@nature.com";
    public static String pwd="testingit";


    // Xpaths, ids
    public static final String Coll_info = "//div[2]/div[1]/div[1]/div";
    public static final String Thread_header = "//div[1]/div/h2";
    public static final String Papers_header = "//div[2]/div/h2";
    public static final String sponsor_tag="//*[@id='sponsor-tagline']";
    public static final String FirstThreadandCard= "//li[1]/article";
    public static final String FirstThreadButton= "//div[1]/ul/li[1]/article/div/div[3]/a/span[2]";
    public static final String FirstArticleCard= "//div[2]/div[3]/div[2]/ul/li[1]/article/div";

   // public static final String FirstArticleCard= "html/body/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li[1]/article/div/div[2]/div[2]";
    public static final String AllArticleCard= "html/body/div[1]/div[3]/div[2]/div[2]/div[2]/ul/li";
    public static final String ishiddenparam= "//article/div/div[2]/div[2]";

    public static final String Map_area= "//div[3]/div[2]/div[3]/div[3]/div";
    public static final String SixthArticleButton= "//div[3]/div[2]/ul/li[6]/article/div/div[3]/a/span[2]/span";
    public static final String FirstThread= "//div[3]/div[1]/ul/li[1]/article/div";
    public static final String FifthThread= "//div[3]/div[1]/ul/li[5]/article/div";


    //Xpaths for preview dots
    public static final String Citationdot= "//div[3]/div[2]/ul/li[6]/article/div/div[3]/ol/li[5]/button";

    // Xpaths from Thread Page
    public static final String ThreadPageHeading = "//h2";
    public static final String Thread_title = "//div[3]/div[1]/ul/li[1]/article/div/div[2]/div/div/h3/a/span";
}
