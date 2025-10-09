package Level2.ex1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;


    public ConfigReader (String fileName){
        properties = new Properties();

        try (FileInputStream fis = new FileInputStream(fileName)) {
            properties.load(fis);
        } catch (IOException e) {
            System.err.println("Error reading config.properties file : " + e.getMessage());
        }

    }

    public String getRequiredProperty(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            throw new IllegalArgumentException("Missing required property: " + key);
        }
        return value;
    }

    public String getDirectoryToRead(){
        return properties.getProperty("directoryToRead");
    }

    public String getOutPutFile() {
        return properties.getProperty("outPutFile");
    }




}
