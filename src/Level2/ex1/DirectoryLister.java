package Level2.ex1;

import Level1.ex3.SaverInTxtFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister {

    public static void listFilesAlphabetically(String path, String outputFilePath) throws IOException {
        File root = new File(path);
        if (path.isEmpty()) {
            System.out.println("Please enter a directory path. ");
            return;
        }

        File directory = new File(path);

        if (!root.exists() || !root.isDirectory()) {
            System.out.println("Invalid directory : " + path);
            return;
        }

        StringBuilder content = new StringBuilder();
        listRecursively(root, 0, content);

        File output = new File(outputFilePath);
        SaverInTxtFile.writeToFile(output, content.toString());


    }

    private static void listRecursively(File directory, int level, StringBuilder content) {
        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            return;
        }

        Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (File file : files) {
            String indent = " ".repeat(level * 2);

            String type = file.isDirectory() ? "D" : "F";

            String lastModified = sdf.format(new Date(file.lastModified()));

            content.append(indent)
                    .append("(").append(type).append(")")
                    .append(file.getName())
                    .append(" - ").append(lastModified)
                    .append(System.lineSeparator());
            if (file.isDirectory()) {
                listRecursively(file, level + 1, content);
            }

        }
    }


}




