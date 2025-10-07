package Level1.ex4;

import java.io.*;

public class TxtFileReader {

    public static void readAndPrintFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);

        if (!file.exists() || !file.isFile()){
            System.out.println("File's type is not valid");
            return;
        }

        System.out.println("File's content " + file.getName());
        System.out.println("--------------------------------------------");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error while reading file" + e.getMessage());
        }

    }
}
