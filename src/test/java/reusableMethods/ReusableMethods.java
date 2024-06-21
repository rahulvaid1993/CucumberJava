package reusableMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReusableMethods {

    public String getProperty(String key) throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");

        Properties prop = new Properties();

        prop.load(fis);

        System.out.println(prop.getProperty(key));

        return prop.getProperty(key);
    }

}
