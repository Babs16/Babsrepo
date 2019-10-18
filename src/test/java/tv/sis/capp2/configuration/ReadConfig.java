package tv.sis.capp2.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties prop;

    public ReadConfig()

    {
        File src = new File("C:/Users/bfatade/capp20cucumberTestFramework/src/test/Drivers/Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            prop = new Properties();
            prop.load(fis);
        }catch (Exception e){
            System.out.println("Exception is " + e.getMessage());
        }

    }

    public String getApplicationUrl()
    {
        String url=prop.getProperty("baseURL");
        return url;
    }

    public String getUsername()
    {
        String username= prop.getProperty("Username");
        return username;
    }

    public String getPassword()
    {
        String password= prop.getProperty("Password");
        return password;
    }

    public String getChromePath()
    {
        String chromepath=prop.getProperty("chromepath");
        return chromepath;
    }

}
