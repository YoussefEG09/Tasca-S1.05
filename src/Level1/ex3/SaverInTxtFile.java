package Level1.ex3;

import java.io.*;

public class SaverInTxtFile {

    public static void writeToFile(File file, String content) throws IOException {

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(content);
                writer.flush();
                System.out.println("Directory listing saved to " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Error saving to file: " + e.getMessage());

        }

    }
}
