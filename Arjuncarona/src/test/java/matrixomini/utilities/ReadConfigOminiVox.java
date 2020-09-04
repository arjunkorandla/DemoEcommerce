package matrixomini.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigOminiVox {
    Properties prop;

    public ReadConfigOminiVox() {
        File src = new File("./Configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            prop = new Properties();
            prop.load(fis);

        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }

    }

    public String getOminiURL() {
        String url = prop.getProperty("OminiURL");
        return url;

    }
    public String getUsername ()
    {
        String collageId = prop.getProperty("collageId");
        return collageId;
    }
    public String getPassword ()
    {
        String collagePassword = prop.getProperty("collagePassword");
        return collagePassword;
    }


}
