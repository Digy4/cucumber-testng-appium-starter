package cucumber.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.Properties;

public class GetProperties {
    public static String testManagementTool = System.getProperty("testManagementTool",propLoad("testManagementTool"));
    public static String xRayUrl = System.getProperty("xray.url",propLoad("xray.url"));
    public static String xRayExecutionId = System.getProperty("xray.testKeys",propLoad("xray.testKeys"));
    public static String clientId = System.getProperty("xray.clientId",propLoad("xray.clientId"));
    public static String clientSecret = System.getProperty("xray.clientSecret",propLoad("xray.clientSecret"));
    public static String featureFileDir = System.getProperty("featureFileDir", propLoad("featureFileDir"));
    public static String testResultdir = System.getProperty("testResultdir", propLoad("testResultdir"));
    public static String downloadFileFormat = System.getProperty("downloadFileFormat", propLoad("downloadFileFormat"));
    public static String xRayInteraction = System.getProperty("testManagementToolInteraction",propLoad("testManagementToolInteraction"));

private static String propLoad(String key){
    Properties prop = new Properties();
    String value=null;
    try {
        URI url = new GetProperties().getClass().getClassLoader().getResource("xray.config.properties").toURI();
        String path = url.getPath();
        InputStream in = new FileInputStream(path);
        prop.load(in);
        value = prop.getProperty(key);
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return value;
}

}

