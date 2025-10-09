package Level2.ex1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConfigReader config = new ConfigReader("config.properties.properties");

        String inputPath = config.getDirectoryToRead();
        String outputPath = config.getOutPutFile();

        if (inputPath == null || inputPath.isEmpty()) {
            System.out.println("⚠️ Please specify 'directoryToRead' in config.properties.properties");
            return;
        }

        if (outputPath == null || outputPath.isEmpty()) {
            System.out.println("⚠️ Please specify 'outPutFile' in config.properties.properties");
            return;
        }

        DirectoryLister.listFilesAlphabetically(inputPath, outputPath);

        System.out.println("✅ Directory listing created successfully at:");
        System.out.println(outputPath);
    }
}


